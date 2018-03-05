package com.ljh.bookstore.domain;

public class ConsumptionDomain {

	private String conId ; //消费序号
	private String  conName ; //消费商品名称
	private String  conMoney;//消费金额
	private String  bookId;//图书序号
	private String  userId ; //用户账号
	private String  addTime;//
	
	public String getConId() {
		return conId;
	}
	public void setConId(String conId) {
		this.conId = conId;
	}
	public String getConName() {
		return conName;
	}
	public void setConName(String conName) {
		this.conName = conName;
	}
	public String getConMoney() {
		return conMoney;
	}
	public void setConMoney(String conMoney) {
		this.conMoney = conMoney;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
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
		return "ConsumptionDomain [conId=" + conId + ", conName=" + conName + ", conMoney=" + conMoney + ", bookId="
				+ bookId + ", userId=" + userId + ", addTime=" + addTime + "]";
	}
	
	
}
