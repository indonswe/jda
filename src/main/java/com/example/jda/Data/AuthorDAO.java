package com.example.jda.Data;

import com.example.jda.models.Author;

import java.util.Collection;

public interface AuthorDAO {
    Author findById(int authorId);
    Collection<Author> findAll();
    Author create(Author author);
    Author update(Author author);
    void delete(int authorId);
}
