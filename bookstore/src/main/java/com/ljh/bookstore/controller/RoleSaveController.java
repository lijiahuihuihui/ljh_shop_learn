/**
 * @author lijiahui
 *
 */
package com.ljh.bookstore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ljh.bookstore.domain.RoleDomain;
import com.ljh.bookstore.sevice.impl.RoleService;

/**
 * 角色管理保存控制层
 * @author skj
 *
 */
public class RoleSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 广告服務層
	 */
	private RoleService RoleService = new RoleService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String roleName = request.getParameter("role_name") ; 
    	String roleSex = request.getParameter("role_sex") ;  
    	String rolePrivilege = request.getParameter("role_privilege") ;  
    	
    	request.setAttribute("roleName", roleName); 
    	request.setAttribute("roleSex", roleSex); 
    	request.setAttribute("rolePrivilege", rolePrivilege); 
    	
    	System.out.println("roleName = " + roleName +" , roleSex = " + roleSex+" , rolePrivilege = " + rolePrivilege );
    	
    	if(roleName == null || "".equals(roleName)) {
    		errorMsg = "角色姓名不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/role_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(roleSex == null || "".equals(roleSex)) {
    		errorMsg = "角色性别不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/role_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(rolePrivilege == null || "".equals(rolePrivilege)) {
    		errorMsg = "角色权限不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/role_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	RoleDomain role = new RoleDomain() ; 
    	role.setRoleName(roleName);
    	role.setRoleSex(roleSex);
    	role.setRolePrivilege(rolePrivilege);
    	
    	
    	boolean b = RoleService.insert(role) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/role/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/role_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


