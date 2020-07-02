package com.board.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.board.web.domains.Member;

@Repository
public interface TxMapper {
	@Insert("insert into members (member_id, password, member_name, email, access_code) "
			+ "values #{memberId}, #{password}, #{memberName}, #{email}, #{accessCode}")
	public void insertMember(Member member);
}
