package com.codingodjo.demo2web.repositores;

import com.codingodjo.demo2web.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
    List<Book> findByTitle(String title);

}
