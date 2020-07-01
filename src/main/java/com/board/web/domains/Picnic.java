
package com.board.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
  * @FileName : Picnic.java
  * @Project : Andes.eGov
  * @Date : 2020. 7. 1. 
  * @작성자 : yerimkang521@gmail.com
  * @설명 : 공유자전거 DTO
  * stationName :
	roadAddress:
	branchAddress: 
	latitude:
	hardness:
	rentable:
	standnum:
  */

@Data
@Component
public class Picnic {
	 private String stationName,
	 roadAddress, branchAddress, latitude, hardness,
	 rentable, standnum;
}