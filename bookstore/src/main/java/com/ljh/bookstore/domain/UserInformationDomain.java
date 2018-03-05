package com.ljh.bookstore.domain;

public class UserInformationDomain {

	private String  user_id ; //用户账号
	private String  user_name ; //用户姓名
	private String  user_sex;//用户性别
	private int  user_age;//用户年龄
	private String  user_password ; //用户密码
	private String  user_address ; //用户地址
	private int  user_number ; //用户手机号码
	private String  addTime;//
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int i) {
		this.user_age = i;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public int getUser_number() {
		return user_number;
	}
	public void setUser_number(int i) {
		this.user_number = i;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "UserInformationDomain [user_id=" + user_id + ", user_name=" + user_name + ", user_sex=" + user_sex
				+ ", user_age=" + user_age + ", user_password=" + user_password + ", user_address=" + user_address
				+ ", user_number=" + user_number + ", addTime=" + addTime + "]";
	}

}
