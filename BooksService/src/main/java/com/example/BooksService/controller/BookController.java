/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.BooksService.controller;

import com.example.BooksService.data.Book;
import com.example.BooksService.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RAVINDU
 */
@RestController
public class BookController 
{
   @Autowired
    private BookService bookService;
    
    @PostMapping(path = "/books")
    public Book createBook(@RequestBody Book book)
    {
      return bookService.createBook(book);
    }
    
    @PutMapping(path = "/books")
    public Book updateById(@RequestBody Book book)
    {
        return bookService.updateById(book);
    }
    
    @GetMapping(path = "/books")
     public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }
     
     @DeleteMapping(path = "/books/{bookId}")
     public void deleteBookById(@PathVariable int bookId)
     {
         bookService.deleteBookById(bookId);
     } 
     
      @GetMapping(path = "/books/{bookId}")
    public Book getBookById(@PathVariable int bookId) {
        return bookService.getBookById(bookId);
    }
    
     @GetMapping(path = "/books", params = "bookName")
    public List<Book> getBookByName(@RequestParam String bookName)
    {
      return bookService.findByName(bookName);
    }
    
    
    @GetMapping(path = "/books", params = "isbn")
    public List<Book> getBookByIsbn(@RequestParam int isbn)
    {
      return bookService.findByIsbn(isbn);
    }
    
      @GetMapping(path = "/books", params = {"bookType", "authorName"})
      public List<Book> findBookByBookTypeAndAuthorName(@RequestParam String bookType, @RequestParam String authorName) {
      return bookService.findByBookTypeAndAuthorName(bookType, authorName);
}
      
     @GetMapping(path = "/books", params = "bookType")
    public List<Book> getBookByBookType(@RequestParam String bookType)
    {
      return bookService.findByBookType(bookType);
    }
}
