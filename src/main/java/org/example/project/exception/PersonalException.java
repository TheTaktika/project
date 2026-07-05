package org.example.project.exception;

public abstract class PersonalException extends RuntimeException {
    public PersonalException(String message) {
        super(message);
    }
}
