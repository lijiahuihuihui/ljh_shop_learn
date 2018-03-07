package com.ljh.bookstore.domain;

public class UserInformationDomain {

	private String  userId ; //用户账号
	private String  userName ; //用户姓名
	private String  userSex;//用户性别
	private int  userAge;//用户年龄
	private String  userPassword ; //用户密码
	private String  userAddress ; //用户地址
	private int  userNumber ; //用户手机号码
	private String  addTime;//
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "UserInformationDomain [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex
				+ ", userAge=" + userAge + ", userPassword=" + userPassword + ", userAddress=" + userAddress
				+ ", userNumber=" + userNumber + ", addTime=" + addTime + "]";
	}
	
	

}
