package com.board.web.controllers;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.board.web.domains.Member;
import com.board.web.enums.Messenger;
import com.board.web.services.MemberService;



@RestController 
@RequestMapping("/members")
@SessionAttributes({"session"})
public class MemberController {
	@Autowired MemberService service;
	@Autowired 	Member member;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@PostMapping("/join")
	public Messenger join(@RequestBody Member member) {	
		System.out.println(member);
		return Messenger.SUCCESS;
	}
	
	
//	@PostMapping("/join")
//	public Messenger join(@RequestBody Member member) {
//		logger.info("String join()");
//		System.out.println("넘어온 회원 정보 : " + member.toString());
//		return Messenger.SUCCESS;
//	}
	
	@PostMapping("/login")
	public Member login(HttpSession session, @RequestBody Member param) {
		Member returnMember = service.findByMemberIdAndPassword(param);
		session.setAttribute("session", returnMember);
		return returnMember;
	}

}
