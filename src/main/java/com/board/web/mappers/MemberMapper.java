package com.board.web.mappers;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
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

	public void truncateMember(HashMap<String, String> hashMap);
	
	public void createDB(HashMap<String, String> paramMap);
	
	public void createMembers(HashMap<String, String> paramMap);
	
	public void dropMembers(HashMap<String, String> paramMap);

	public Member selectByMemberIdAndPassword(Member param);

}