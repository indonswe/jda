package com.example.jda.Data;

import com.example.jda.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Collection;

public class BookDAORepository implements BookDAO{

    private final EntityManager em;

    @Autowired
    public BookDAORepository(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional(readOnly = true)
    public Book findById(Integer integer) {
        return null;
    }

    @Override
    public Collection<Book> findAll() {
        return null;
    }

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void delete(Integer bookId) {

    }
}
