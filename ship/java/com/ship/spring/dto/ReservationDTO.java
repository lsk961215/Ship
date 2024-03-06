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
	private String hhmm;
	private String wy_cd;
	private String wy_nm;
	private String st_cd;
	private String st_nm;
	private String rsv_num;
	private String al_rsv_num;
	private String wa_num;
	private String al_wa_num;
	private String price;
	private String us_cd;
	private String rv_cd;
	private String custCnt;
	private String custNm;
	private String custSSNF;
	private String custSSNB;
	private String custPhone;
	private String postCode;
	private String roadAddr;
	private String dtlAddr;
	private String usr_no;
	private String rsvDt;
}
