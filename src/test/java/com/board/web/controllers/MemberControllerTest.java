/**
 * 
 */
package com.board.web.controllers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.board.web.services.MemberService;

/**
  * @FileName : MemberControllerTest.java
  * @Project : Andes.eGov
  * @Date : 2020. 7. 3. 
  * @작성자 : yerimkang521@gmail.com
  */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})
public class MemberControllerTest {

	@Autowired MemberService service;
	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.board.web.controllers.MemberController#login(javax.servlet.http.HttpSession, com.board.web.domains.Member)}.
	 */
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
