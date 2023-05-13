package com.michelon.bookslibrary.dtos;

import com.michelon.bookslibrary.entities.Book;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

/**
 * @autor raqueldarellimichelon
 * created on 13/05/23 inside the package - com.michelon.bookslibrary.dtos
 **/
@Getter
@Setter
public class BookDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public BookDTO() {
    }

    public BookDTO(Book entity) {
        BeanUtils.copyProperties(entity, this); //in order to copyProperties working, we must have getters and setters
    }
}


