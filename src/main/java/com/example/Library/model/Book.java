package com.example.Library.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Title must not be blank")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Author must not be blank")
    @Column(nullable = false)
    private String author;

    @NotBlank(message = "ISBN must not be blank and must be unique")
    @Column(nullable = false , unique = true)
    private String isbn;

    @Column(nullable = false)
    private Boolean available = true;
}