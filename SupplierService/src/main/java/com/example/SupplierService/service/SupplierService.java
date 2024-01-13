/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.SupplierService.service;

import com.example.SupplierService.data.Supplier;
import com.example.SupplierService.data.SupplierRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RAVINDU
 */
@Service
public class SupplierService {
    
    @Autowired
    private SupplierRepository supplierRepository;
    
    public List<Supplier> getAllSuppliers()
    {
        List<Supplier> suppliers = supplierRepository.findAll();
        return suppliers;
    }
    
    public Supplier getSupplierById(int id) {
        Optional<Supplier> supplier = supplierRepository.findById(id);
        return supplier.get();
    }

    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
    
     public void deleteById(int id) {
        supplierRepository.deleteById(id);
    }

    public Supplier updateById(Supplier sup) {
        return supplierRepository.save(sup);
    }
    
     public List<Supplier> findByName(String name) {
        List<Supplier> suppliers = supplierRepository.findByName(name);
        return suppliers;
    }

    public List<Supplier> findByNic(int nic) {
        List<Supplier> suppliers = supplierRepository.findByNic(nic);
        return suppliers;
    }
    
    
    
}
