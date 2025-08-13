package org.demo.service;

import org.demo.entity.CourseEntity;
import java.util.List;

public interface CourseService {

    CourseEntity addCourse(CourseEntity courseEntity);

    CourseEntity getCourseDetails(Long id);

    List<CourseEntity> getAllCourses();

    CourseEntity updateCourse(Long id, CourseEntity updatedCourse);

    void deleteCourse(Long id);

    void deleteAllCourses();

    List<CourseEntity> searchByAuthor(String author);

    List<CourseEntity> searchByCourseName(String courseName);
}
