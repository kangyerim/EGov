/**
 * 
 */
package com.board.web.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.board.web.proxies.Box;

/**
  * @FileName : Calculator.java
  * @Project : Andes.eGov
  * @Date : 2020. 7. 3. 
  * @작성자 : yerimkang521@gmail.com
  */
@Component
public class Calculator {
	@Autowired Box<Integer> box;
	
	public int num(int a, int b) {
		box.put("res", a+b);
		return box.get("res");
	}
	
	public int substract(int a, int b) {
		return a-b;
	}
	
	public int absoluteVal(int a) {
		return Math.abs(a);
	}
}
