package com.ljh.bookstore.domain;

public class RoleDomain {

	private String  roleId ; //角色账号
	private String  roleName ; //角色姓名
	private String  roleSex;//角色性别
	private String  rolePrivilege;//角色权限
	private String  addTime;//
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleSex() {
		return roleSex;
	}
	public void setRoleSex(String roleSex) {
		this.roleSex = roleSex;
	}
	public String getRolePrivilege() {
		return rolePrivilege;
	}
	public void setRolePrivilege(String rolePrivilege) {
		this.rolePrivilege = rolePrivilege;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		return "RoleDomain [roleId=" + roleId + ", roleName=" + roleName + ", roleSex=" + roleSex + ", rolePrivilege="
				+ rolePrivilege + ", addTime=" + addTime + "]";
	}
	
}
