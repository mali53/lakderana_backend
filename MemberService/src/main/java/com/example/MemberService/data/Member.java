/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MemberService.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RAVINDU
 */
@Entity
@Table(name = "member")
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    @Column(name = "member_name")
    private String memberName;
    @Column(name = "member_nic")
    private String memberNic;
    @Column(name = "member_address")
    private String memberAddress;
    @Column(name = "member_mobile")
    private String memberMobile;
    @Column(name = "member_gmail")
    private String memberGmail;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberNic() {
        return memberNic;
    }

    public void setMemberNic(String memberNic) {
        this.memberNic = memberNic;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getMemberGmail() {
        return memberGmail;
    }

    public void setMemberGmail(String memberGmail) {
        this.memberGmail = memberGmail;
    }
    
    
    
    
}
