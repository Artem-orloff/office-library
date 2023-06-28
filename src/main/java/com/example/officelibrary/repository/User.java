package com.example.officelibrary.repository;

import jakarta.persistence.*;



@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "second_name")
    private String secondname;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "type_user")
    private String typeuser;

    public void setId(int id) {
    }
}
