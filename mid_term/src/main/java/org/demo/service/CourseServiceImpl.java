package org.demo.service;

import org.demo.entity.CourseEntity;
import org.demo.exception.CourseNotFoundException;
import org.demo.exception.CourseNotFoundInCartException;
import org.demo.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    @Autowired
    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public CourseEntity addCourse(CourseEntity courseEntity) {
        System.err.println("Starting to add course...");
        courseEntity.corseGoingToAdded();
        return courseRepo.save(courseEntity);
    }

    @Override
    public CourseEntity getCourseDetails(Long id) {
        System.err.println("searching for id : " + id);
        return courseRepo.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course with ID " + id + " not found."));
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        System.err.println("Giving all the courses");
        return courseRepo.findAll();
    }

    @Override
    public CourseEntity updateCourse(Long id, CourseEntity updatedCourse) {
        System.err.println("updating course with id : " + id);
        CourseEntity courseEntity = courseRepo.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Cannot update. Course with ID " + id + " not found."));
        courseEntity.setCourseName(updatedCourse.getCourseName());
        courseEntity.setAuthorName(updatedCourse.getAuthorName());
        courseEntity.setDuration(updatedCourse.getDuration());
        courseEntity.setAvailability(updatedCourse.getAvailability());
        return courseRepo.save(courseEntity);
    }

    @Override
    public void deleteCourse(Long id) {
        System.err.println("deleting course with id : " + id);
        if (!courseRepo.existsById(id)) {
            throw new CourseNotFoundException("Cannot delete. Course with ID " + id + " does not exist.");
        }
        courseRepo.deleteById(id);
    }

    @Override
    public void deleteAllCourses() {
        System.err.println("deleting all courses");
        courseRepo.deleteAll();
    }

    @Override
    public List<CourseEntity> searchByAuthor(String author) {
        return courseRepo.findByAuthorNameContainingIgnoreCase(author);
    }

    @Override
    public List<CourseEntity> searchByCourseName(String courseName) {
        return courseRepo.findByCourseNameContainingIgnoreCase(courseName);
    }

    @Override
    public Map<Long, CourseEntity> addToCart(Long courseId) {
        CourseEntity courseEntity = courseRepo.findById(courseId)
                .orElseThrow(() -> new CourseNotFoundException("Cannot add to cart. Course with ID " + courseId + " not found."));
        CourseEntity.cart.put(courseId, courseEntity);
        return CourseEntity.cart;
    }

    @Override
    public Map<Long, CourseEntity> removeFromCart(Long courseId) {
        if (!CourseEntity.cart.containsKey(courseId)) {
            throw new CourseNotFoundInCartException("Cannot remove. Course with ID " + courseId + " is not in the cart.");
        }
        CourseEntity.cart.remove(courseId);
        return CourseEntity.cart;
    }

    @Override
    public Map<Long, CourseEntity> displayCart() {
        return CourseEntity.cart;
    }
}
