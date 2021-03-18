package com.example.jda.Data;

import com.example.jda.models.Book;

import java.util.Collection;

public interface BookDAO {
    Book findById(int booKId);
    Collection<Book> findAll();
    Book create(Book book);
    Book update(Book book);
    void delete(Integer bookId);
}
