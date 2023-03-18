package com.example.elizavetaproject.repository;

import com.example.elizavetaproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
