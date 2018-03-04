package com.ljh.bookstore.domain;

public class BookClassifyDomain {
	private String classId ; //id
	private String  className ; //菜单名称
	private String  addTime;
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "BookClassifyDomain [classId=" + classId + ", className=" + className + ", addTime=" + addTime + "]";
	}
	
}
