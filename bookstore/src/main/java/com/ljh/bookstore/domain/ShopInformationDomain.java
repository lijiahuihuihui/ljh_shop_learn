package com.ljh.bookstore.domain;

public class ShopInformationDomain {

	private String  bookId ; //图书的序号
	private String  bookName ; //图书的名字
	private int  bookNum;//图书的数量
	private int  bookPrice;//图书的单价
	private int  bookPriceSum ; //所有图书总价
	private String  informationId ; //购物信息序号
	private String  userId ; //用户账号
	private String  addTime;//
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int i) {
		this.bookNum = i;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int i) {
		this.bookPrice = i;
	}
	public int getBookPriceSum() {
		return bookPriceSum;
	}
	public void setBookPriceSum(int i) {
		this.bookPriceSum = i;
	}
	public String getInformationId() {
		return informationId;
	}
	public void setInformationId(String informationId) {
		this.informationId = informationId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "ShopInformationDomain [bookId=" + bookId + ", bookName=" + bookName + ", bookNum=" + bookNum
				+ ", bookPrice=" + bookPrice + ", bookPriceSum=" + bookPriceSum + ", informationId=" + informationId
				+ ", userId=" + userId + ", addTime=" + addTime + "]";
	}
	
}
