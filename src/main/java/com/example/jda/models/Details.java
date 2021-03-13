package com.example.jda.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Details {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int detailsId;
        @Column(unique = true)
        private String email;
        private String name;
        private LocalDate birthDate;

    //@OneToOne(mappedBy = "Details")
    //private AppUser appUser;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "details_id", table = "app_user")
        private AppUser appUser;

        //private Details userDetails;



    public Details(int detailsId, String email, String name, LocalDate birthDate, AppUser appUser) {
        this.detailsId = detailsId;
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
        this.appUser = appUser;
    }

    public Details() {
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

