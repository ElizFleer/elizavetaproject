package com.example.elizavetaproject.controller;

import com.example.elizavetaproject.dto.AllGroupResponseDto;
import com.example.elizavetaproject.dto.AllStudentResponseDto;
import com.example.elizavetaproject.dto.StudentDto;
import com.example.elizavetaproject.entity.Student;
import com.example.elizavetaproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/students")
@RequiredArgsConstructor
@RestController
public class StudentController {


    private final StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody StudentDto studentDto){
        studentService.addStudent(studentDto);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student = studentService.getStudent(id);

        return student;
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id){
        Student student = studentService.getStudent(id);

        studentService.deleteStudent(id);
    }
}
