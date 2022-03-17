package com.codingodjo.demo2web.controllers;


import com.codingodjo.demo2web.models.Book;
import com.codingodjo.demo2web.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksApiController {
    private final BookService bookService;

    public BooksApiController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/api/books")
    public List<Book> allBooks() {
        return bookService.allBooks();
    }

    @PostMapping("/api/books")
    public Book createBook(@RequestParam(value="title") String title,@RequestParam(value="author") String author,@RequestParam(value="pages") Integer pages) {
        Book book = new Book(title,author,pages);
        return bookService.createBook(book);
    }

    @GetMapping("/api/books/{id}")
    public Book getBook(@PathVariable(value="id") Long id) {
        return bookService.findBook(id);
    }

    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book updateBook(@PathVariable("id") Long id,@RequestParam(value="title") String title,@RequestParam(value="author") String author,@RequestParam(value="pages") Integer pages) {
        return bookService.updateBook(id,title,author,pages);
    }

    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}






// Language: java
