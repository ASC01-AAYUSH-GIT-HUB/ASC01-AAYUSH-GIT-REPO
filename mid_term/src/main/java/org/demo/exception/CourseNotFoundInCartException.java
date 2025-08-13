package org.demo.exception;

public class CourseNotFoundInCartException extends RuntimeException {
    public CourseNotFoundInCartException(String message) {
        super(message);
    }
}
