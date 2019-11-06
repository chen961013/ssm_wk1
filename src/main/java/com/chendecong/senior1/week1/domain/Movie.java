package com.chendecong.senior1.week1.domain;
/**
 * 
 * @ClassName: Movie 
 * @Description: TODO
 * @author: Chen
 * @date: 2019年11月5日 上午8:51:43
 */
public class Movie {

	private Integer id;
	private String name;
	private String actor;
	private Integer price;
	private String startTime;
	private Integer longTime;
	private String type;
	private Integer year;
	private String area;
	private String status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getLongTime() {
		return longTime;
	}

	public void setLongTime(Integer longTime) {
		this.longTime = longTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actor=" + actor + ", price=" + price + ", startTime="
				+ startTime + ", longTime=" + longTime + ", type=" + type + ", year=" + year + ", area=" + area
				+ ", status=" + status + "]";
	}

}
