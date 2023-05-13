package com.michelon.bookslibrary.services;

import com.michelon.bookslibrary.dtos.BookListDTO;
import com.michelon.bookslibrary.repositories.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.services
 **/
@Service
public class BookListService {

    @Autowired
    private BookListRepository bookListRepository;


    @Transactional(readOnly = true) //announce that will not write on the db, so the transaction tends to be faster
    public List<BookListDTO> findAll(){
        return bookListRepository.findAll().stream().map(BookListDTO::new).toList();
    }
}


