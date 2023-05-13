package com.michelon.bookslibrary.repositories;

import com.michelon.bookslibrary.entities.Book;
import com.michelon.bookslibrary.projections.BookMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @autor raqueldarellimichelon
 * created on 12/05/23 inside the package - com.michelon.bookslibrary.repositories
 **/
public interface BookRepository extends JpaRepository<Book, Long> {

    //query nativa SQL; if used, the result query must be an interface (in this case BookMinProjection)
    @Query(nativeQuery = true, value = """
		SELECT tb_book.id, tb_book.title, tb_book.game_year AS bookYear, tb_book.img_url AS imgUrl,
		tb_book.short_description AS shortDescription, tb_belonging.position
		FROM tb_book
		INNER JOIN tb_belonging ON tb_book.id = tb_belonging.book_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
	List<BookMinProjection> searchByList(Long listId); // the listId param is passed by the query as :listId

}


