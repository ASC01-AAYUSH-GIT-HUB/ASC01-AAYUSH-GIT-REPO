package org.demo.controller;

import org.demo.entity.CourseEntity;
import org.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Get all courses
    @GetMapping("/all")
    List<CourseEntity> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Get a single course by ID
    @GetMapping("/{id}")
    CourseEntity getCourseById(@PathVariable Long id) {
        return courseService.getCourseDetails(id);
    }

    // Search by course name
    @GetMapping("/search/name/{name}")
    List<CourseEntity> searchByCourseName(@PathVariable String name) {
        return courseService.searchByCourseName(name);
    }

    // Search by author name
    @GetMapping("/search/author/{author}")
    List<CourseEntity> searchByAuthor(@PathVariable String author) {
        return courseService.searchByAuthor(author);
    }

    // Add course (Add to cart)
    @PostMapping("/add")
    CourseEntity addCourse(@RequestBody CourseEntity course) {
        return courseService.addCourse(course);
    }

    // Update course details
    @PutMapping("/update/{id}")
    CourseEntity updateCourse(@PathVariable Long id, @RequestBody CourseEntity updatedCourse) {
        return courseService.updateCourse(id, updatedCourse);
    }

    // Delete a single course (Remove from cart)
    @DeleteMapping("/delete/{id}")
    void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    // Delete all courses
    @DeleteMapping("/deleteAll")
    void deleteAllCourses() {
        courseService.deleteAllCourses();
    }

    @PostMapping("/cart/add/{id}")
    Map<Long,CourseEntity> addingInCart(@PathVariable Long id){
        return courseService.addToCart(id);
    }

    @DeleteMapping("/cart/remove/{id}")
    Map<Long,CourseEntity> removingFromCart(@PathVariable Long id){
        return courseService.removeFromCart(id);
    }

    @GetMapping("/cart/all")
    Map<Long,CourseEntity> displayAllInCart(){
        return CourseEntity.cart;
    }
}
