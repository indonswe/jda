package com.example.jda.Data;

import com.example.jda.models.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.xml.crypto.Data;
import java.util.Collection;

public class AppUserDaoRepository implements com.example.jda.Data.AppUserDAO {

   private final EntityManager em;

    @Autowired
    public AppUserDaoRepository(EntityManager em) {
        this.em = em;
    }


    /*@Override
    @Transactional(readOnly = true)
    public Details findById(Integer integer) {
        return em.find(Details.class, integer);
    }*/


    @Override
    @Transactional
    public AppUser create(AppUser appUser) {
        em.persist(appUser);
        return appUser;
    }

    @Override
    @Transactional(readOnly = true)
    public AppUser findById(Integer appUserID) {
        return em.find(AppUser.class,appUserID);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<AppUser> findAll() {
        return em
                .createQuery("SELECT appUser FROM AppUser appUser", AppUser.class)
                .getResultList();
    }

    @Override
    @Transactional
    public AppUser update(AppUser appUser) {
        em.merge(appUser);
        return appUser;
    }

    @Override
    public void delete(Integer appUser) {

    }
}
