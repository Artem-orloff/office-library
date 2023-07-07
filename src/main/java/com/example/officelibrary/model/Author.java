package com.example.officelibrary.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "biographi")
    private String biography;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "author")
    private List<Book> books = new ArrayList<>();

    public Author(String firstName, String birthdate, String biography){
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.biography = biography;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondname) {
        this.secondName = secondname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biographi) {
        this.biography = biographi;
    }

    @Override
    public String toString(){
        return "Author{" +
                "Id" + Id +
                ", first_name" + firstName +
                ", second_name" + secondName + '\'' +
                ", birthdate" + birthdate + '\'' +
                ", biography" + biography +'\'' +
                '}';
    }

}
