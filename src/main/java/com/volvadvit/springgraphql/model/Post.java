package com.volvadvit.springgraphql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String type;
    @Column(name = "created_date", columnDefinition = "TIMESTAMP")
    private LocalDate createdDate;
}