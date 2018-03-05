package com.ljh.bookstore.domain;

public class ShopCollectionDomain {

	private String bookId ; //图书序号
	private String  userId ; //用户账号
	private String  collectionId;//收藏序号
	private String  addTime;//
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
	public String getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(String collectionId) {
		this.collectionId = collectionId;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "ShopCollectionDomain [bookId=" + bookId + ", userId=" + userId + ", collectionId=" + collectionId
				+ ", addTime=" + addTime + "]";
	}
	
}
