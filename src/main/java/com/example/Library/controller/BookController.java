package com.example.Library.controller;

import com.example.Library.model.Book;
import com.example.Library.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public ResponseEntity<Object> addBook(@RequestBody @Valid Book book) {
        try {
            Book saved = service.save(book);
            return ResponseEntity.status(HttpStatus.CREATED).body(saved);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        try {
            List<Book> books = service.getAll();
            return ResponseEntity.ok(books);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable int id) {
        try {
            Book book = service.getById(id);
            if (book == null) {
                return ResponseEntity.status(404).body(null);
            }
            return ResponseEntity.ok(book);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        try {
            boolean removed = service.delete(id);
            if (removed) {
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.status(404).body("Book not found");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error deleting book");
        }
    }

    @PatchMapping("/{id}/availability")
    public ResponseEntity<String> updateAvailability(@PathVariable int id, @RequestParam boolean available) {
        try {
            boolean updated = service.updateAvailability(id, available);
            if (updated) {
                return ResponseEntity.ok("Availability updated");
            } else {
                return ResponseEntity.status(404).body("Book not found");
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating availability");
        }
    }
}
