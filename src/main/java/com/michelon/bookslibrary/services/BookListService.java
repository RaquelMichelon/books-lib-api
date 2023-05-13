package com.michelon.bookslibrary.services;

import com.michelon.bookslibrary.dtos.BookListDTO;
import com.michelon.bookslibrary.dtos.BookResponseDTO;
import com.michelon.bookslibrary.projections.BookMinProjection;
import com.michelon.bookslibrary.repositories.BookListRepository;
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
public class BookListService {

    @Autowired
    private BookListRepository bookListRepository;

    @Autowired
    private BookRepository bookRepository;


    @Transactional(readOnly = true) //announce that will not write on the db, so the transaction tends to be faster
    public List<BookListDTO> findAll(){
        return bookListRepository.findAll().stream().map(BookListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {
        //get the list in memory
        List<BookMinProjection> list = bookRepository.searchByList(listId);

        //remove obj from the list and save it in memory
        BookMinProjection obj = list.remove(sourceIndex);

        //add obj to list in the new position
        list.add(destinationIndex, obj);

        //update only the items between sourceIndex and destinationIndex
        int min = Math.min(sourceIndex, destinationIndex);
        int max = Math.max(sourceIndex, destinationIndex);

        for(int i = min; i <= max; i++) {
            bookListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }



    }

}


