package com.BookLibrary.book.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Book {
    private Long id;
    private String name;
    private String author;
}
