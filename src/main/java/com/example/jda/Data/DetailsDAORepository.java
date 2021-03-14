package com.example.jda.Data;/*package Data;

import models.AppUser;
import models.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Collection;

@Repository
public class DetailsDAORepository implements DetailsDAO {

    private final EntityManager em;

    @Autowired
    public DetailsDAORepository(EntityManager em) {
        this.em = em;
    }


    @Override
    @Transactional(readOnly = true)
    public Details findById(Integer integer) {
        return em.find(Details.class, integer);
    }
    @Override
    @Transactional(readOnly = true)
    public Collection<AppUser> findAll() {
        return em.createQuery("Select user From AppUser user", AppUser.class)
                .getResultList();
    }
    @Override
    @Transactional
    public AppUser create(AppUser appUser){
        em.persist(appUser);
        return appUser;
    }
    @Override
    @Transactional
    public AppUser update(AppUser appUser){
        return em.merge(appUser);
    }
    /*@Override
    @Transactional
    public void delete(Integer integer){
        AppUser appUser = findById(integer);
        if(appUser!=null){
            em.remove(appUser);
        }
    }
}
*/


