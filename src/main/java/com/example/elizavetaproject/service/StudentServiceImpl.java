package com.example.elizavetaproject.service;

import com.example.elizavetaproject.dto.AddGroupRequestDto;
import com.example.elizavetaproject.entity.Group;
import com.example.elizavetaproject.entity.Student;
import com.example.elizavetaproject.repository.GroupRepository;
import com.example.elizavetaproject.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        Student student = null;
        Optional<Student> st = studentRepository.findById(id);
        if(st.isPresent()){
            student=st.get();
        }
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
