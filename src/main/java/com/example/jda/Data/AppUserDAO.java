package com.example.jda.Data;

//import models.AppUser;

import java.util.Collection;

import com.example.jda.models.AppUser;


public interface AppUserDAO {
   /* public interface StudentDAO extends QueryStudent{
        Student create(Student student);
        Student findById(Integer studentId);
        Collection<Student> findAll();
        Student update(Student student);
        boolean delete(Integer studentId);
    }*/

       AppUser create(AppUser appUser);
       AppUser findById(Integer appUserID);
       Collection<AppUser> findAll();
       AppUser update(AppUser appUser);
       void delete(Integer appUser);


}
