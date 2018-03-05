package com.ljh.bookstore.domain;

public class ManagerDomain {

	private String managerId ; //管理员账号
	private String  managerName ; //管理员姓名
	private String  managerSex;//管理员性别
	private int  managerAge;//管理员年龄
	private String  managerPassword ; //管理员密码
	private int  managerNumber ; //管理员电话
	private String  addTime;//
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerSex() {
		return managerSex;
	}
	public void setManagerSex(String managerSex) {
		this.managerSex = managerSex;
	}
	public int getManagerAge() {
		return managerAge;
	}
	public void setManagerAge(int i) {
		this.managerAge = i;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	public int getManagerNumber() {
		return managerNumber;
	}
	public void setManagerNumber(int i) {
		this.managerNumber = i;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "ManagerDomain [managerId=" + managerId + ", managerName=" + managerName + ", managerSex=" + managerSex
				+ ", managerAge=" + managerAge + ", managerPassword=" + managerPassword + ", managerNumber="
				+ managerNumber + ", addTime=" + addTime + "]";
	}
	
}
