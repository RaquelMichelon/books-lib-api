package com.michelon.bookslibrary.services;

import com.michelon.bookslibrary.dtos.BookDTO;
import com.michelon.bookslibrary.dtos.BookResponseDTO;
import com.michelon.bookslibrary.entities.Book;
import com.michelon.bookslibrary.projections.BookMinProjection;
import com.michelon.bookslibrary.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.services
 **/
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional(readOnly = true) //ACID - Atomica Consistente Isolada e Durável
    public BookDTO findById(Long id) {
        //to do: create exception here
        Book result = bookRepository.findById(id).get();
        return new BookDTO(result);
    }

    @Transactional(readOnly = true) //announce that will not write on the db, so the transaction tends to be faster
    public List<BookResponseDTO> findAll(){
        return bookRepository.findAll().stream().map(BookResponseDTO::new).toList();
    }

    @Transactional(readOnly = true) //announce that will not write on the db, so the transaction tends to be faster
    public List<BookResponseDTO> findByList(Long listId){
        return bookRepository.searchByList(listId).stream().map(BookResponseDTO::new).toList();
    }
}


