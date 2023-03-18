package com.example.elizavetaproject.controller;

import com.example.elizavetaproject.entity.Student;
import com.example.elizavetaproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(path="/students")
@RequiredArgsConstructor
@RestController
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public void addStudent(@Valid @RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
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
