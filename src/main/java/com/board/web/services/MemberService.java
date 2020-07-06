package com.board.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.board.web.domains.Member;

@Component
public interface MemberService {
	public void signIn (Member member);
	
	public void remove (Member member);
	
	public void modify (Member member);
	
	public List<Member> listAll();
	
	public Member listOne(String memberId);
	
	public Member logIn (Member member);
	
	public Member findByMemberIdAndPassword(Member member);

}
