package com.volvadvit.springgraphql.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String type;
    @Column(name = "created_date", columnDefinition = "TIMESTAMP")
    private LocalDate createdDate;

    public Post(String author, String title, String type, LocalDate createdDate) {
        this.author = author;
        this.title = title;
        this.type = type;
        this.createdDate = createdDate;
    }
}