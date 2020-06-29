package com.board.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.board.web.domains.Member;

@Repository
public interface MemberMapper {

	public void create(Member member);

	public void delete(Member member);

	public void update(Member member);

	public List<Member> listAll();

	public Member detail(String memberId);

	public Member login(Member member);

}