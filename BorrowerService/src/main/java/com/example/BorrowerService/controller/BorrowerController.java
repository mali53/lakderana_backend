/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.BorrowerService.controller;

import com.example.BorrowerService.data.Borrower;
import com.example.BorrowerService.service.BorrowerService;
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
public class BorrowerController {
    
    
    @Autowired
    private BorrowerService borrowerService;
    
    
     @GetMapping(path = "/borrowers")
     public List<Borrower> getAllBorrowers()
    {
        return borrowerService.getAllBorrowers();
    }
     
      @GetMapping(path = "/borrowers/{id}")
    public Borrower getBorrowerById(@PathVariable int id) {
        return borrowerService.getBorrowerById(id);
    }
    
    @PostMapping(path = "/borrowers")
    public Borrower createBorrower(@RequestBody Borrower bor){
        return borrowerService.createBorrower(bor);
    }
    
    @DeleteMapping(path="/borrowers/{id}")
    public void deleteBorrowerById(@PathVariable int id)
    {
        borrowerService.deleteById(id);
    }
    
    @PutMapping(path="/borrowers")
    public Borrower updateById(@RequestBody Borrower borrower)
    {
        return borrowerService.updateById(borrower);
    }
    
     @GetMapping(path = "/borrowers", params = "issueDate")
    public List<Borrower> getBorrowerByIssueDate(@RequestParam String issueDate)
    {
      return borrowerService.findByIssueDate(issueDate);
    }
    
    
    @GetMapping(path = "/borrowers", params = "memberId")
    public List<Borrower> getBorrowerByBorrowerId(@RequestParam int memberId)
    {
      return borrowerService.findByMemberId(memberId);
    }
    
     @GetMapping(path = "/borrowers", params = "returnDate")
    public List<Borrower> getBorrowerByReturnDate(@RequestParam String returnDate)
    {
      return borrowerService.findByReturnDate(returnDate);
    }
}
