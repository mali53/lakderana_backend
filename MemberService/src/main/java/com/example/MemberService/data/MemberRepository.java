/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.MemberService.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RAVINDU
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    
    @Query("select m from Member m where m.memberName=?1")
    List<Member> findByName(String memberName);
    
    @Query("select st from Member st where st.memberNic=?1")
    List<Member> findByNic(String memberNic);
    
}
