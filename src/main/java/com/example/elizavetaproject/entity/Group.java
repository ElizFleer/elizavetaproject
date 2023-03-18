package com.example.elizavetaproject.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name="un_groups")
public class Group {

    @Column(name="id")
    @Id
    private int id;
    @Column(name="number")
    @NotBlank
    private String number;
    @Column(name="quantity")
    @NotBlank
    private int quantity;
    @OneToMany(mappedBy = "group")
    private List <Student> students;
}
