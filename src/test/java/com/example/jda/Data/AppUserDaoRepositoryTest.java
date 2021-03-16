package com.example.jda.Data;

import com.example.jda.models.AppUser;
import com.example.jda.models.Details;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/*
@SpringBootTest
@AutoConfigureTestDatabase
@AutoConfigureTestEntityManager
@Transactional
@DirtiesContext
class AppUserDaoRepositoryTest {

    @Autowired
    private AppUserDAO testObject;
    @Autowired private TestEntityManager em;

    private AppUser persistedAppUser;

    @BeforeEach
    void setUp() {
        (int appUserId, String username, String password, LocalDate regDate, Details userDetails)
        AppUser unpersisted = new AppUser(null, "Erik", "Svensson", LocalDate.parse("1976-09-11"));
        persistedAppUser = em.persistAndFlush(unpersisted);
    }

    @AfterEach
    void tearDown() {
        em.flush();
    }

    @Test
    @DisplayName("Given new student create should return entity with id")
    void create() {
        AppUser appUser = new AppUser(
                null, "Teresia", "Gable", LocalDate.parse("1989-07-13")
        );

        AppUser result = testObject.create(appUser);

        assertNotNull(result);
        assertNotNull(result.getAppUserID());
    }



    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}

*/