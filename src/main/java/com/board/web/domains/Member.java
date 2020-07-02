package com.board.web.domains;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private String memberId, password, memberName, email, accessCode;
}
