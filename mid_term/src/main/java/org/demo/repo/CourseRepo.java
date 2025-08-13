package org.demo.repo;

import org.demo.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepo extends JpaRepository<CourseEntity,Long> {

    List<CourseEntity> findByAuthorNameContainingIgnoreCase(String authorName);

    List<CourseEntity> findByCourseNameContainingIgnoreCase(String courseName);
}
