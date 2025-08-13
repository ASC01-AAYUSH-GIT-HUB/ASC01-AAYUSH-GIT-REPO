package org.demo.service;

import org.demo.entity.CourseEntity;
import org.demo.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

        return courseRepo.save(courseEntity);
    }

    @Override
    public CourseEntity getCourseDetails(Long id) {
        return courseRepo.findById(id).orElse(null);
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public CourseEntity updateCourse(Long id, CourseEntity updatedCourse) {
        CourseEntity courseEntity = courseRepo.getById(id);
        courseEntity.setCourseName(updatedCourse.getCourseName());
        courseEntity.setAuthorName(updatedCourse.getAuthorName());
        courseEntity.setDuration(updatedCourse.getDuration());
        courseEntity.setAvailability(updatedCourse.getAvailability());
        return courseRepo.save(courseEntity);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

    @Override
    public void deleteAllCourses() {
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
}
