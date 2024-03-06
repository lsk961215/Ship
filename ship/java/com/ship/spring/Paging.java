package com.ship.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Paging {
	private int currPage;
	private int perPage;
	private int countPage;
	private String minRow;
	private String maxRow;
	
	public Paging(String perPage, String currPage) {
		this.perPage = Integer.parseInt(perPage);
		this.currPage = Integer.parseInt(currPage);
	}
	
	public void setPaging() {
		int minRow = (this.perPage * (this.currPage - 1)) +1;
		int maxRow = this.perPage * this.currPage;
		
		this.minRow = Integer.toString(minRow);
		this.maxRow = Integer.toString(maxRow);
	}
}
