package com.ljh.bookstore.domain;

public class LoginInformationDomain {

	private String loginId ; //登陆账号
	private String  loginName ; //登陆人员姓名
	private int  loginNum;//登陆次数
	private String  userId;//用户账号
	private String  addTime;//
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(int i) {
		this.loginNum = i;
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
		return "LoginInformationDomain [loginId=" + loginId + ", loginName=" + loginName + ", loginNum=" + loginNum
				+ ", userId=" + userId + ", addTime=" + addTime + "]";
	}
	
}
