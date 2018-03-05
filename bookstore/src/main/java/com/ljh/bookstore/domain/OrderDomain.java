package com.ljh.bookstore.domain;

public class OrderDomain {

	private String orderId ; //订单序号
	private String  orderInformationId ; //订单商品序号
	private int  bookNum;//图书数量
	private int  bookPrice;//图书单价
	private int  bookPriceSum ; //所有图书总价
	private String  orderCondition ; //订单状态
	private String  addTime;//
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderInformationId() {
		return orderInformationId;
	}
	public void setOrderInformationId(String orderInformationId) {
		this.orderInformationId = orderInformationId;
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
	public String getOrderCondition() {
		return orderCondition;
	}
	public void setOrderCondition(String orderCondition) {
		this.orderCondition = orderCondition;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "OrderDomain [orderId=" + orderId + ", orderInformationId=" + orderInformationId + ", bookNum=" + bookNum
				+ ", bookPrice=" + bookPrice + ", bookPriceSum=" + bookPriceSum + ", orderCondition=" + orderCondition
				+ ", addTime=" + addTime + "]";
	}
	
}
