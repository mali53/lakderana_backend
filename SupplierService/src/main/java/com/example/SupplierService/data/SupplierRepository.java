/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.SupplierService.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RAVINDU
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
     
    @Query("select s from Supplier s where s.name=?1")
    List<Supplier> findByName(String name);
    
    @Query("select st from Supplier st where st.nic=?1")
    List<Supplier> findByNic(int nic);
    
}
