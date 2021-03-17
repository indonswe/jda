package com.example.jda.models;



import javax.persistence.*;
import java.util.Set;

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer AuthorId;
    String firstName;
    String lastName;
    @ManyToMany(
            cascade = {CascadeType.REFRESH, CascadeType.DETACH},
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "author_idandbook_id",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    Set<Book> writtenBooks;
}
