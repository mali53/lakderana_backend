/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.BorrowerService.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RAVINDU
 */
@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Integer> {
    
    @Query("select d from Borrower d where d.issueDate=?1")
    List<Borrower> findByIssueDate(String issueDate);
    
    @Query("select st from Borrower st where st.memberId=?1")
    List<Borrower> findByMemberId(int memberId);
    
     
    @Query("select dd from Borrower dd where dd.returnDate=?1")
    List<Borrower> findByReturnDate(String returnDate);
}
