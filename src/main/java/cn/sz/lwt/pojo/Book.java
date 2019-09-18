package cn.sz.lwt.pojo;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer bookId;
	private String book_name;
	private String public_dept;
	private Double book_price;
	private Date public_date;
	private String book_auth;
	private String img_path;
	private String summary;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getPublic_dept() {
		return public_dept;
	}
	public void setPublic_dept(String public_dept) {
		this.public_dept = public_dept;
	}
	public Double getBook_price() {
		return book_price;
	}
	public void setBook_price(Double book_price) {
		this.book_price = book_price;
	}
	public Date getPublic_date() {
		return public_date;
	}
	public void setPublic_date(Date public_date) {
		this.public_date = public_date;
	}
	public String getBook_auth() {
		return book_auth;
	}
	public void setBook_auth(String book_auth) {
		this.book_auth = book_auth;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}

