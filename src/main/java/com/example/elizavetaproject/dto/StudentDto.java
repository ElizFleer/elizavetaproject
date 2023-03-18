package com.example.elizavetaproject.dto;

import com.example.elizavetaproject.entity.Group;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class StudentDto {

    private int studentId;

    private String studentFullName;

    private int studentEntranceDate;

    private Group group;
}
