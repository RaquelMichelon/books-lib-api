package com.michelon.bookslibrary.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * @autor raqueldarellimichelon
 * created on 13/05/23 inside the package - com.michelon.bookslibrary.entities
 **/
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Embeddable //because BelongingPK is a type that represents two fields, and we have to map the id on the Belonging class to two fields on the db
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "book_id") //to create pk on table belonging
    private Book book;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private BookList bookList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(book, that.book) && Objects.equals(bookList, that.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, bookList);
    }
}


