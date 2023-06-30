package com.example.officelibrary.model;


import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
//    @ManyToOne()
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "name")
    private String name;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "type")
    private String type;

    @Column(name = "readerid")
    private Long readerId;

//    @ManyToOne
//    @JoinColumn(name = "Id", nullable = false)
//    private Author author;

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

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
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
