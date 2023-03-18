package com.example.elizavetaproject.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name="students")
public class Student {
    @GeneratedValue
    @Column(name="id")
    @Id
    private int id;
    @Column(name="full_name")
    @NotBlank
    private String fullName;
    @Column(name="entrance_date")
    @NotBlank
    private int entranceDate;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}
