package com.board.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Member {
	private int memberNo;
	private String memeberId, password, memberName, email;
}
