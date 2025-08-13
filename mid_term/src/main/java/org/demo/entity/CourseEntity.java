package org.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Course")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    @Column(name = "course_name",nullable = false)
    private String courseName;
    @Column(name = "author_name",nullable = false)
    private String authorName;
    @Column(name = "Duration_in_hour")
    private String duration;
    @Column(name = "Availability")
    private Boolean availability;

    public CourseEntity() {
    }

    public CourseEntity( String courseName, String authorName, String duration, Boolean availability) {
        this.courseName = courseName;
        this.authorName = authorName;
        this.duration = duration;
        this.availability = availability;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public void corseGoingToAdded(CourseEntity courseEntity){
        System.err.println(courseEntity.getCourseName() + " | " +
                courseEntity.getAuthorName() + " | " +
                courseEntity.getDuration() + " | " +
                courseEntity.getAvailability());
    }
    public static Map<Long,CourseEntity> cart=new HashMap<>();
}
