package com.example.jda.Data;

import com.example.jda.models.AppUser;
import com.example.jda.models.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;
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
    public Collection<Details> findAll() {
        return em.createQuery("Select user From AppUser user", Details.class)
                .getResultList();
    }
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Details create(Details details){
        em.persist(details);
        return details;
    }
    @Override
    @Transactional
    public Details update(Details details){
        return em.merge(details);
    }
    @Override
    @Transactional
    public void delete(Integer integer){
    Details details = findById(integer);
        //AppUser appUser = findById(integer);
        if(details!=null){
            em.remove(details);
        }
    }
}



