/**
 * 
 */
package com.board.web.tests;

import org.springframework.stereotype.Component;

/**
  * @FileName : Printer.java
  * @Project : Andes.eGov
  * @Date : 2020. 7. 2. 
  * @작성자 : yerimkang521@gmail.com
  * @see : junit 테스트 인터페이스
  */
@Component("conPrinter")
public interface Printer {
    public void print(String message);
}