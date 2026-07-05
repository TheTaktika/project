package org.example.project.sort;

import org.example.project.entities.Student;

public class SortAge implements Sorter {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
