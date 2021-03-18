

package com.example.jda.Data;


import com.example.jda.models.AppUser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.*;
import com.example.jda.models.Book;

@SpringBootTest
@AutoConfigureTestDatabase
@AutoConfigureTestEntityManager
@Transactional
@DirtiesContext
//@WebAppConfiguration



class BookDAORepositoryTest {

    @Autowired
    private BookDAO testObject;
    @Autowired private TestEntityManager em;

    private Book persistedBook;

    @BeforeEach
    void setUp() {
        Book unpersisted = new Book(null,"Karl", "Marxx", 333);
        persistedBook = em.persistAndFlush(unpersisted);
    }

    @AfterEach
    void tearDown() {
        em.flush();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    Book book = new Book(null,"Karl", "Marxx", 5);

        Book result = testObject.create(book);
	assertNotNull(result);
        assertNotNull(result.getBookId());
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}

