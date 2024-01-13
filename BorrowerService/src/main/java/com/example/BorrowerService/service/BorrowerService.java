/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.BorrowerService.service;

import com.example.BorrowerService.data.Borrower;
import com.example.BorrowerService.data.BorrowerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RAVINDU
 */
@Service
public class BorrowerService {
    
    @Autowired
    private BorrowerRepository borrowerRepository;
    
     public List <Borrower> getAllBorrowers()
    {
      List<Borrower> borrowers = borrowerRepository.findAll();
      return borrowers;
    }
     
    public Borrower getBorrowerById(int id) {
        Optional<Borrower> borrower = borrowerRepository.findById(id);
        return borrower.get();
    }

    public Borrower createBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }

    public void deleteById(int id) {
        borrowerRepository.deleteById(id);
    }

    public Borrower updateById(Borrower bor) {
        return borrowerRepository.save(bor);
    }
    
    public List<Borrower> findByIssueDate(String issueDate) {
        List<Borrower> borrowers = borrowerRepository.findByIssueDate(issueDate);
        return borrowers;
    }

    public List<Borrower> findByMemberId(int memberId) {
        List<Borrower> borrowers = borrowerRepository.findByMemberId(memberId);
        return borrowers;
    }
    
     public List<Borrower> findByReturnDate(String returnDate) {
        List<Borrower> borrowers = borrowerRepository.findByReturnDate(returnDate);
        return borrowers;
    }
    
}
