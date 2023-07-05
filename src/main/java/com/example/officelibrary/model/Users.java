package com.example.officelibrary.model;

import jakarta.persistence.*;
import org.apache.tomcat.util.digester.Rule;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Role;

import java.util.HashSet;


@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
//    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
//    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "id"))
//    @Enumerated(EnumType.STRING)
//    private Set<Role> roles = new HashSet<>();

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "type_user")
    private String typeUser;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Book book;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userid) {
        this.userId = userid;
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

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeuser) {
        this.typeUser = typeuser;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userId +
                ", firstname" + firstName + '\'' +
                ", secondname" + secondName + '\'' +
                ", birthdate" + birthdate + '\'' +
                ", typeuser" + typeUser + '\'' +
                '}';
    }
//
//    @Override
}
