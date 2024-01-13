/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MemberService.controller;

import com.example.MemberService.data.Member;
import com.example.MemberService.service.MemberService;
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
public class MemberController {
    
    @Autowired
    private MemberService memberService;

    @GetMapping(path = "/members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
    
    @GetMapping(path = "/members/{memberId}")
    public Member getMemberById(@PathVariable int memberId) {
        return memberService.getMemberById(memberId);
    }
    
    @PostMapping(path = "/members")
    public Member createMember(@RequestBody Member mem){
        return memberService.createMember(mem);
    }
    
    @DeleteMapping(path="/members/{memberId}")
    public void deleteMemberById(@PathVariable int memberId)
    {
        memberService.deleteById(memberId);
    }
    
    @PutMapping(path="/members")
    public Member updateById(@RequestBody Member member)
    {
        return memberService.updateById(member);
    }
    
     @GetMapping(path = "/members", params = "memberName")
    public List<Member> getMemberByName(@RequestParam String memberName)
    {
      return memberService.findByName(memberName);
    }
    
    
    @GetMapping(path = "/members", params = "memberNic")
    public List<Member> getMemberByNic(@RequestParam String memberNic)
    {
      return memberService.findByNic(memberNic);
    }
}
