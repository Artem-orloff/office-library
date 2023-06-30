package com.example.officelibrary.model;

import jakarta.persistence.*;



@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "type_user")
    private String typeUser;

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
}
