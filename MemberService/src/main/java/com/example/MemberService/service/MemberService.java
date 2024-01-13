/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MemberService.service;

import com.example.MemberService.data.Member;
import com.example.MemberService.data.MemberRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RAVINDU
 */
@Service
public class MemberService {
    
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        List<Member> members = memberRepository.findAll();
        return members;
    }
    
     public Member getMemberById(int memberId) {
        Optional<Member> member = memberRepository.findById(memberId);
        return member.get();
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public void deleteById(int memberId) {
        memberRepository.deleteById(memberId);
    }

    public Member updateById(Member mem) {
        return memberRepository.save(mem);
    }
    
      public List<Member> findByName(String memberName) {
        List<Member> members = memberRepository.findByName(memberName);
        return members;
    }

    public List<Member> findByNic(String memberNic) {
        List<Member> members = memberRepository.findByNic(memberNic);
        return members;
    }
}
