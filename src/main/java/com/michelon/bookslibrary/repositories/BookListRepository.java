package com.michelon.bookslibrary.repositories;

import com.michelon.bookslibrary.entities.BookList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.repositories
 **/
public interface BookListRepository extends JpaRepository<BookList, Long> {

}


