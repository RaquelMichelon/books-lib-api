package com.michelon.bookslibrary.services;

import com.michelon.bookslibrary.dtos.BookResponseDTO;
import com.michelon.bookslibrary.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.services
 **/
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<BookResponseDTO> findAll(){
        return bookRepository.findAll().stream().map(BookResponseDTO::new).toList();
    }
}


