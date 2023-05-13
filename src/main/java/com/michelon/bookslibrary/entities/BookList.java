package com.michelon.bookslibrary.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.entities
 **/
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_book_list")
public class BookList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookList bookList = (BookList) o;
        return id.equals(bookList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


