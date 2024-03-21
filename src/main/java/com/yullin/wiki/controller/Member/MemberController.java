package com.yullin.wiki.controller.Member;

import com.yullin.wiki.domain.Member.*;
import com.yullin.wiki.repository.Member.MemberRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@Controller
public class MemberController {

    private final MemberRepository mr;

    public MemberController(MemberRepository mr){
        this.mr = mr;
    }


    @GetMapping("/main")
    public String main() {
        return "/Member/NewMemberIdPw";
    }

    @PostMapping("SignUp")
    public String SignUp (SignUpData sud, Model model) {
            Member member = new Member();

            member.setMember_id(sud.getId());
            member.setPasswd(sud.getPw());
            mr.save(member);
            model.addAttribute("Id",member.getMember_id());
            model.addAttribute("Pw",member.getPasswd());
            System.out.println("Sigup 구문 실행됨");



        return "/Member/NewMemberIdPw";
    }

}
