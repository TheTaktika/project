package org.example.project.sort;

import org.example.project.entities.Student;

public class SortCreatedAt implements Sorter {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getCreatedAt().compareTo(s2.getCreatedAt());
    }
}
