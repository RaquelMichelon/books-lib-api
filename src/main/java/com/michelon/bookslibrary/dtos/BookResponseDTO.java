package com.michelon.bookslibrary.dtos;

import com.michelon.bookslibrary.entities.Book;
import com.michelon.bookslibrary.projections.BookMinProjection;
import lombok.*;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary
 **/
@Getter
public class BookResponseDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public BookResponseDTO() {
    }

    public BookResponseDTO(Book entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public BookResponseDTO(BookMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getBookYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }
}


