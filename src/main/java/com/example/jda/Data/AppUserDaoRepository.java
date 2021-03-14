package com.example.jda.Data;

import com.example.jda.models.AppUser;
import org.springframework.beans.factory.annotation.Autowired;


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
    public AppUser create(AppUser appUser) {
        return null;
    }

    @Override
    public AppUser findById(Integer appUserID) {
        return em.find(AppUser.class,appUserID);
    }

    @Override
    public Collection<AppUser> findAll() {
        return null;
    }

    @Override
    public AppUser update(AppUser appUser) {
        return null;
    }

    @Override
    public void delete(Integer appUser) {

    }
}
