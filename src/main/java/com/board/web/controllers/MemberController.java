package com.board.web.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.web.domains.Member;
import com.board.web.enums.Messenger;
import com.board.web.services.MemberService;



@Controller
@RequestMapping("/members")
public class MemberController {
	@Autowired MemberService service;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@PostMapping("/join")
	public String join(@RequestBody Member member) {
		logger.info("String join()");
		System.out.println("넘어온 회원 정보 : " + member.toString());
		return "SUCCESS";
	}

}
