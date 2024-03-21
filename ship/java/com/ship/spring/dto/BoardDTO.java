package com.ship.spring.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
	private String perPage;
	private String currPage;
	private String boNo;
	private String usrNm;
	private String boTi;
	private String boDt;
	private String boCd;
	private String boPw;
	private String prNo;
	private String boPrv;
	private String boCont;
	private String minRow;
	private String maxRow;
}
