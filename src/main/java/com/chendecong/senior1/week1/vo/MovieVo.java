package com.chendecong.senior1.week1.vo;

import com.chendecong.senior1.week1.domain.Movie;

public class MovieVo extends Movie {

	private String sTime;
	private String eTime;
	private Integer p1;
	private Integer p2;
	private Integer starLongTime;
	private Integer endLongTime;

	private String orderMethod;
	private String orderField;

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public String geteTime() {
		return eTime;
	}

	public void seteTime(String eTime) {
		this.eTime = eTime;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		this.p2 = p2;
	}

	public Integer getStarLongTime() {
		return starLongTime;
	}

	public void setStarLongTime(Integer starLongTime) {
		this.starLongTime = starLongTime;
	}

	public Integer getEndLongTime() {
		return endLongTime;
	}

	public void setEndLongTime(Integer endLongTime) {
		this.endLongTime = endLongTime;
	}

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

}
