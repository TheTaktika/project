package org.example.project.entities;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@JsonDeserialize(builder = Student.Builder.class)
public class Student {
    private final UUID id;
    private String fullName;
    private int age;
    private int averageScore;
    private final LocalDateTime createdAt;
    private UUID groupId;

    private Student(Builder builder) {
        this.id = builder.id != null ? builder.id : UUID.randomUUID();
        this.fullName = builder.fullName;
        this.age = builder.age;
        this.groupId = builder.groupId;
        this.averageScore = builder.averageScore;
        this.createdAt = builder.createdAt != null ? builder.createdAt : LocalDateTime.now();
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        String date = createdAt.format(DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss"));
        return String.format("Student{ID: %s, Full name: '%s', age: %d, average score: %d, group: '%s', Created at: %s}",
               id, fullName, age, averageScore, groupId, date);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private UUID id;
        private String fullName;
        private int age;
        private UUID groupId;
        private int averageScore;
        private LocalDateTime createdAt;

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder groupId(UUID groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder averageScore(int averageScore) {
            this.averageScore = averageScore;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
