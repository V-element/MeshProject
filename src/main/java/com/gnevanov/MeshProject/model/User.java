package com.gnevanov.MeshProject.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NaturalId
    @NotBlank
    @Size(max=50)
    @Email
    private String email;

    private int age;

    @NotBlank
    @Size(min=6, max = 100)
    private String password;



}
