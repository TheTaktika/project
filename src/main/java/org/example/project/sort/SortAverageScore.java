package org.example.project.sort;

import org.example.project.entities.Student;

public class SortAverageScore implements Sorter {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAverageScore(), s2.getAverageScore());
    }
}
