package com.michelon.bookslibrary.repositories;

import com.michelon.bookslibrary.entities.BookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.repositories
 **/
public interface BookListRepository extends JpaRepository<BookList, Long> {

    @Modifying //mandatory if the query isn't just a select
    @Query(nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND book_id = :bookId")
    void updateBelongingPosition(Long listId, Long bookId, Integer newPosition);

}


