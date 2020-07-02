/**
 * 
 */
package com.board.web.tests;

import org.springframework.stereotype.Component;

/**
  * @FileName : ConsolePrinter.java
  * @Project : Andes.eGov
  * @Date : 2020. 7. 2. 
  * @작성자 : yerimkang521@gmail.com
  */
@Component("conPrinter")
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
 
