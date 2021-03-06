package com.example.jda.models;

import javax.persistence.*;
import java.util.Set;

import java.util.Objects;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer bookId;
    String isbn;
    String title;
    int maxDays;
    @ManyToMany(
            cascade = {CascadeType.REFRESH, CascadeType.DETACH},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "author_id_and_book_id",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    Set<Author> authors;

    public Book(Integer bookId, String isbn, String title, int maxDays, Set<Author> authors) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.maxDays = maxDays;
        this.authors = authors;
    }

    public Book(Integer bookId, String isbn, String title, int maxDays) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.maxDays = maxDays;
        //this.authors = authors;
    }

    public Book(){

    }

    public int getBookId() {
        return bookId;
    }

    //public void setBookId(int bookId) {
    //    this.bookId = bookId;
    //}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxLoanDays() {
        return maxDays;
    }

    public void setMaxLoanDays(int maxLoanDays) {
        this.maxDays = maxDays;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
