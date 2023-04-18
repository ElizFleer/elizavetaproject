package com.example.elizavetaproject.service;

import com.example.elizavetaproject.dto.StudentDto;
import com.example.elizavetaproject.entity.Student;

import java.util.List;

public interface StudentService {

    void addStudent(StudentDto studentDto);

    public List<Student> getAllStudents();

    public Student getStudent(int id);

    void deleteStudent(int id);
}
