package com.michelon.bookslibrary.dtos;

import com.michelon.bookslibrary.entities.BookList;

/**
 * @autor raqueldarellimichelon
 * created on 13/05/23 inside the package - com.michelon.bookslibrary.dtos
 **/
public class BookListDTO {

    private Long id;
    private String name;

    public BookListDTO() {
    }

    public BookListDTO(BookList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


