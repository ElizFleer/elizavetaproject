package com.example.elizavetaproject.service;

import com.example.elizavetaproject.entity.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudent(int id);

    void deleteStudent(int id);
}
