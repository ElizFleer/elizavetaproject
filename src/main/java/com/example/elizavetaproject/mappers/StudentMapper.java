package com.example.elizavetaproject.mappers;

import com.example.elizavetaproject.dto.StudentDto;
import com.example.elizavetaproject.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDto studentToStudentDTO(Student entity);


    Student studentDTOtoStudent(StudentDto dto);
}

