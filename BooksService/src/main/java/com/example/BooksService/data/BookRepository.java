/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.BooksService.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RAVINDU
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    
    @Query("select b from Book b where b.bookName=?1")
    List<Book> findByName(String bookName);
    
    @Query("select st from Book st where st.isbn=?1")
    List<Book> findByIsbn(int isbn);
    
    @Query("SELECT b FROM Book b WHERE b.bookType = :bookType AND b.authorName = :authorName")
    List<Book> findByBookTypeAndAuthorName(@Param("bookType") String bookType, @Param("authorName") String authorName);
    
    @Query("select bo from Book bo where bo.bookType=?1")
    List<Book> findByBookType(String bookType);

    
}
