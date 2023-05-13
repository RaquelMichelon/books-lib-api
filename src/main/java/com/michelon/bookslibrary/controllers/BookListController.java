package com.michelon.bookslibrary.controllers;

import com.michelon.bookslibrary.dtos.BookDTO;
import com.michelon.bookslibrary.dtos.BookListDTO;
import com.michelon.bookslibrary.dtos.BookResponseDTO;
import com.michelon.bookslibrary.dtos.ReplacementDTO;
import com.michelon.bookslibrary.services.BookListService;
import com.michelon.bookslibrary.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/{listId}/replacements") //we choose post instead of put since it is not an idempotent operation
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
         bookListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

    @GetMapping(value = "/{listId}/books")
    public List<BookResponseDTO> findByList(@PathVariable Long listId) {
        return bookService.findByList(listId);
    }

    @GetMapping
    public List<BookListDTO> findAll() {
        return bookListService.findAll();
    }
}


