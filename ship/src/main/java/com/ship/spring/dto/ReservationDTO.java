package com.ship.spring.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReservationDTO {
	private String yearMonth;
	private String tm_no;
	private String tm_dt;
	private String tm_cd;
	private String tm_nm;
	private String way;
	private String st_cd;
	private String st_nm;
	private String rsv_num;
	private String al_num;
	private String pr_cd;
	private String pr_nm;
	private String custNm;
	private String custSSNF;
	private String custSSNB;
	private String custPhone;
	private String roadAddr;
	private String dtlAddr;
	private List usrNoList;
}
