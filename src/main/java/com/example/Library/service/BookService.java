package com.example.Library.service;

import com.example.Library.model.Book;
import com.example.Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public Book save(Book book) {
        List<Book> Duplicate=repo.findByIsbn(book.getIsbn());
        if(!Duplicate.isEmpty()){
            throw new RuntimeException("Book already exist");
        }
        return repo.save(book);



    }

    public List<Book> getAll() {
        return repo.findAll();
    }

    public Book getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public boolean delete(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public boolean updateAvailability(int id, boolean available) {
        Book book = repo.findById(id).orElse(null);
        if (book != null) {
            book.setAvailable(available);
            repo.save(book);
            return true;
        }
        return false;
    }
}