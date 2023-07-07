package com.example.officelibrary.model;

import com.example.officelibrary.model.enums.Role;
import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_user")
    private Role type;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "birthdate")
    private String birthdate;

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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Role getType() {
        return type;
    }

    public void setType(Role type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userId +
                ", firstname" + firstName + '\'' +
                ", secondname" + secondName + '\'' +
                ", birthdate" + birthdate + '\'' +
                ", typeuser" + type + '\'' +
                '}';
    }
}