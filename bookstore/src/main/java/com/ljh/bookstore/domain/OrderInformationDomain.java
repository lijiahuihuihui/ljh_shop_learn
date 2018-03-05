package com.ljh.bookstore.domain;

public class OrderInformationDomain {

	private String bookId ; //图书的序号
	private String  bookName ; //图书的名字
	private int  bookNum;//图书的数量
	private int  bookPrice;//图书的单价
	private String  orderInformationId ; //订单商品序号
	private String  userId ; //用户账号
	private String  orderId ; //订单序号
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
	public String getOrderInformationId() {
		return orderInformationId;
	}
	public void setOrderInformationId(String orderInformationId) {
		this.orderInformationId = orderInformationId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "OrderInformationDomain [bookId=" + bookId + ", bookName=" + bookName + ", bookNum=" + bookNum
				+ ", bookPrice=" + bookPrice + ", orderInformationId=" + orderInformationId + ", userId=" + userId
				+ ", orderId=" + orderId + ", addTime=" + addTime + "]";
	}
	
}
