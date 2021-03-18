package com.example.jda.Data;

import com.example.jda.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Collection;

@Repository
public class BookDAORepository implements BookDAO{

    private final EntityManager em;

    @Autowired
    public BookDAORepository(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional(readOnly = true)
    public Book findById(int integer) {
        return null;
    }

    @Override
    public Collection<Book> findAll() {
        return null;
    }

    @Override
    @Transactional
    public Book create(Book book) {
        em.persist(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public void delete(Integer bookId) {

    }
}
