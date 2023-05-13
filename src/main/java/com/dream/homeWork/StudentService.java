package com.dream.homeWork;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "John", 20, "john@gmail.com"));
        students.add(new Student(2, "Mary", 22, "mary@gmail.com"));
        students.add(new Student(3, "Bob", 19, "bob@gmail.com"));

        return students;
    }
}
