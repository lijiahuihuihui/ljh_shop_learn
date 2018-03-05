package com.ljh.bookstore.domain;

public class MenuDomain {

	private String id ; //id
	private String  menuName ; //菜单名称
	private String addTime;

	
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	@Override
	public String toString() {
		return "MenuDomain [id=" + id + ", menuName=" + menuName + ", addTime=" + addTime + "]";
	}

}
