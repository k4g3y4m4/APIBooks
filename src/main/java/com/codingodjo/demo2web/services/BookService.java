package com.codingodjo.demo2web.services;


import com.codingodjo.demo2web.models.Book;
import com.codingodjo.demo2web.repositores.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // devuelve todos los libros
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    // crea un libro
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    // recupera un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(((Optional<?>) optionalBook).isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    // actualiza un libro
    public Book updateBook(Long id, String title, String author, Integer pages ) {
        Book b = findBook(id);
        if(b != null) {
            b.setTitle(title);
            b.setAuthor(author);
            b.setPages(pages);
            return bookRepository.save(b);
        } else {
            return null;
        }
    }

    // borra un libro
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
