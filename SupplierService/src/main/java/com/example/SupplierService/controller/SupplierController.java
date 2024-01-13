/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SupplierService.controller;

import com.example.SupplierService.data.Supplier;
import com.example.SupplierService.service.SupplierService;
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
public class SupplierController {
    
    @Autowired
    private SupplierService supplierService;
    
    @GetMapping(path = "/suppliers")
    public List<Supplier> getAllSuppliers()
    {
        return supplierService.getAllSuppliers();
    }
    
     @GetMapping(path = "/suppliers/{id}")
    public Supplier getSupplierById(@PathVariable int id) {
        return supplierService.getSupplierById(id);
    }
    
    @PostMapping(path = "/suppliers")
    public Supplier createSupplier(@RequestBody Supplier sup){
        return supplierService.createSupplier(sup);
    }
    
    @DeleteMapping(path="/suppliers/{id}")
    public void deleteSupplierById(@PathVariable int id)
    {
        supplierService.deleteById(id);
    }
    
    @PutMapping(path="/suppliers")
    public Supplier updateById(@RequestBody Supplier supplier)
    {
        return supplierService.updateById(supplier);
    }
    
    @GetMapping(path = "/suppliers", params = "name")
    public List<Supplier> getSupplierByName(@RequestParam String name)
    {
      return supplierService.findByName(name);
    }
    
    
    @GetMapping(path = "/suppliers", params = "nic")
    public List<Supplier> getSupplierByNic(@RequestParam int nic)
    {
      return supplierService.findByNic(nic);
    }
}
