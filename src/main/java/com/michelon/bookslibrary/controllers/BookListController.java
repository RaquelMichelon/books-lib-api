package com.michelon.bookslibrary.controllers;

import com.michelon.bookslibrary.dtos.BookDTO;
import com.michelon.bookslibrary.dtos.BookListDTO;
import com.michelon.bookslibrary.dtos.BookResponseDTO;
import com.michelon.bookslibrary.services.BookListService;
import com.michelon.bookslibrary.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.controllers
 **/
@RestController
@RequestMapping(value = "api/v1/lists")
public class BookListController {

    @Autowired
    private BookListService bookListService;

    @GetMapping
    public List<BookListDTO> findAll() {
        return bookListService.findAll();
    }
}


