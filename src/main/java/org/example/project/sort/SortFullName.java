package org.example.project.sort;

import org.example.project.entities.Student;

public class SortFullName implements Sorter {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFullName().compareTo(s2.getFullName());
    }
}
