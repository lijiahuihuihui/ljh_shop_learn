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

import com.ljh.bookstore.domain.ManagerDomain;
import com.ljh.bookstore.sevice.impl.ManagerService;

/**
 * 管理员管理保存控制层
 * @author skj
 *
 */
public class ManageSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 管理员管理服務層
	 */
	private ManagerService ManagerService = new ManagerService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String managerName = request.getParameter("manager_name") ; 
    	String managerSex = request.getParameter("manager_sex") ; 
    	String managerAge = request.getParameter("manager_age") ; 
    	String managerPassword = request.getParameter("manager_password") ; 
    	String managerNumber = request.getParameter("manager_number") ; 
    	
    	request.setAttribute("managerName", managerName); 
    	request.setAttribute("managerSex", managerSex); 
    	request.setAttribute("managerAge", managerAge); 
    	request.setAttribute("managerPassword", managerPassword); 
    	request.setAttribute("managerNumber", managerNumber);  
    	
    	System.out.println("managerName = " + managerName +" , managerSex = " + managerSex+" , managerAge = " + managerAge+" , managerPassword = " + managerPassword+" , managerNumber = " + managerNumber );
    	
    	if(managerName == null || "".equals(managerName)) {
    		errorMsg = "管理员姓名不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/manage_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(managerSex == null || "".equals(managerSex)) {
    		errorMsg = "管理员性别不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/manage_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(managerPassword == null || "".equals(managerPassword)) {
    		errorMsg = "管理员密码不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/manage_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(managerNumber == null || "".equals(managerNumber)) {
    		errorMsg = "管理员电话不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/manage_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	int managerAgeInt = 0 ; 
    	try {
    		managerAgeInt = Integer.parseInt(managerAge) ; 
    	}catch(Exception e) {
    		errorMsg = "管理员年龄只能是數字" ; 
    		return ; 
    	}
    	
    	int managerNumberInt = 0 ; 
    	try {
    		managerNumberInt = Integer.parseInt(managerNumber) ; 
    	}catch(Exception e) {
    		errorMsg = "管理员电话只能是數字" ; 
    		return ; 
    	}
    	
    	ManagerDomain manage = new ManagerDomain() ; 
    	manage.setManagerName(managerName);
    	manage.setManagerSex(managerSex);
    	manage.setManagerAge(managerAgeInt);
    	manage.setManagerPassword(managerPassword);
    	manage.setManagerNumber(managerNumberInt);
    	
    	
    	boolean b = ManagerService.insert(manage) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/manage/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/manage_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


