package com.example.elizavetaproject.dto;

import com.example.elizavetaproject.entity.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private int studentId;

    private String studentFullName;

    private int studentEntranceDate;

}
