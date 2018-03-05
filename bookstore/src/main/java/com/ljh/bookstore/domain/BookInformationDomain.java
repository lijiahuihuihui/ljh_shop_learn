package com.ljh.bookstore.domain;

public class BookInformationDomain {
	
	private String bookId ; //图书的序号
	private String  bookName ; //图书的名字
	private String  bookAuthor;//图书的作者
	private String  bookPrice;//图书的单价
	private String  bookPublish ; //图书的出版社
	private String  bookPages ; //图书的页数
	private String  bookCondition;//图书状态
	private String  classId ; //分类序号
	private String  bookPicUrl ; //图片路径	
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
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	public String getBookPages() {
		return bookPages;
	}
	public void setBookPages(String bookPages) {
		this.bookPages = bookPages;
	}
	public String getBookCondition() {
		return bookCondition;
	}
	public void setBookCondition(String bookCondition) {
		this.bookCondition = bookCondition;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getBookPicUrl() {
		return bookPicUrl;
	}
	public void setBookPicUrl(String bookPicUrl) {
		this.bookPicUrl = bookPicUrl;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "BookInformationDomain [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + ", bookPublish=" + bookPublish + ", bookPages=" + bookPages
				+ ", bookCondition=" + bookCondition + ", classId=" + classId + ", bookPicUrl=" + bookPicUrl
				+ ", addTime=" + addTime + "]";
	}

}
