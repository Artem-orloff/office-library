package com.example.officelibrary.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "name")
    private String name;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "type")
    private String type;

    @Column(name = "author_id")
    private Long author_id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Author author;

    public Long getId() {
        return bookId;
    }

    public void setId(Long id) {
        bookId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getAuthor_Id() {
        return author_id;
    }

    public void setAuthor_Id(Long readerId) {
        this.author_id = author_id;
    }

    @Override
    public String toString(){
        return "Book{" +
                "Id=" + bookId +
                ", name" + name + '\'' +
                ", birthdate" + birthdate + '\'' +
                ", type" + type + '\'' +
                '}';
    }
}
