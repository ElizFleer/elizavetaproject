package com.example.elizavetaproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllStudentResponseDto {

    private int studentId;

    private String studentFullName;

    private int studentEntranceDate;
}
