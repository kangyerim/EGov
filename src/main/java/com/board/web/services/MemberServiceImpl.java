package com.board.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.web.domains.Member;
import com.board.web.mappers.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired MemberMapper mapper;
	@Autowired Member member;

	@Override
	public void signIn(Member member) {
		mapper.create(member);
	}

	@Override
	public void remove(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member listOne(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member logIn(Member member) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Member findByMemberIdAndPassword(Member param) {
		// TODO Auto-generated method stub
		return mapper.selectByMemberIdAndPassword(param);
	}

}
