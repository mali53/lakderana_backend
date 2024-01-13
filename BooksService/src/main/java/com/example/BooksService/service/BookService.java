/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.BooksService.service;

import com.example.BooksService.data.Book;
import com.example.BooksService.data.BookRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RAVINDU
 */
@Service
public class BookService 
{
    @Autowired
    private BookRepository bookRepository;
    
    public Book createBook(Book book)
    {
       return bookRepository.save(book);
    }
    
     public Book updateById(Book book)
    {
        return bookRepository.save(book);
    }
     
     public List <Book> getAllBooks()
    {
      List<Book> books = bookRepository.findAll();
      return books;
    }
     
      public void deleteBookById (int bookId)
    {
        bookRepository.deleteById(bookId);
    }
      
    public Book getBookById(int bookId) {
        Optional<Book> books = bookRepository.findById(bookId);
        return books.get();
    }
    
     public List<Book> findByName(String bookName) {
        List<Book> books = bookRepository.findByName(bookName);
        return books;
    }

    public List<Book> findByIsbn(int isbn) {
        List<Book> books = bookRepository.findByIsbn(isbn);
        return books;
    }
    
     public List<Book> findByBookTypeAndAuthorName(String bookType, String authorName) {
        List<Book> books = bookRepository.findByBookTypeAndAuthorName(bookType, authorName);
        return books;
    }
     
      public List<Book> findByBookType(String bookType) {
        List<Book> books = bookRepository.findByBookType(bookType);
        return books;
    }
}
