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

import com.ljh.bookstore.domain.UserInformationDomain;
import com.ljh.bookstore.sevice.impl.UserInformationService;

/**
 * 用户信息保存控制层
 * @author skj
 *
 */
public class UserSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 广告服務層
	 */
	private UserInformationService UserInformationService = new UserInformationService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String userName = request.getParameter("user_name") ; 
    	String userSex = request.getParameter("user_sex") ;  
    	String userAge = request.getParameter("user_age") ; 
    	String userPassword = request.getParameter("user_password") ;  
    	String userAddress = request.getParameter("user_address") ; 
    	String userNumber = request.getParameter("user_number") ;  
    	
    	request.setAttribute("userName", userName); 
    	request.setAttribute("userSex", userSex);
    	request.setAttribute("userAge", userAge); 
    	request.setAttribute("userPassword", userPassword);
    	request.setAttribute("userAddress", userAddress); 
    	request.setAttribute("userNumber", userNumber);
    	
    	System.out.println("userName = " + userName +" , userSex = " + userSex +" , userAge = " + userAge +" , userPassword = " + userPassword +" , userAddress = " + userAddress +" , userNumber = " + userNumber );
    	
    	if(userName == null || "".equals(userName)) {
    		errorMsg = "用户名字不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/user_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userSex == null || "".equals(userSex)) {
    		errorMsg = "用户性别不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/user_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userAge == null || "".equals(userAge)) {
    		errorMsg = "用户年龄不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/user_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userPassword == null || "".equals(userPassword)) {
    		errorMsg = "用户密码不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/user_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userAddress == null || "".equals(userAddress)) {
    		errorMsg = "用户地址不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/user_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userNumber == null || "".equals(userNumber)) {
    		errorMsg = "用户电话不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/user_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	int userAgeInt = 0 ; 
    	try {
    		userAgeInt = Integer.parseInt(userAge) ; 
    	}catch(Exception e) {
    		errorMsg = "用户年龄只能是數字" ; 
    		return ; 
    	}
    	
    	int userNumberInt = 0 ; 
    	try {
    		userNumberInt = Integer.parseInt(userNumber) ; 
    	}catch(Exception e) {
    		errorMsg = "用户电话只能是數字" ; 
    		return ; 
    	}
    	
    	UserInformationDomain user = new UserInformationDomain() ; 
    	user.setUserName(userName);
    	user.setUserSex(userSex);
    	user.setUserAge(userAgeInt);
    	user.setUserPassword(userPassword);
    	user.setUserAddress(userAddress);
    	user.setUserNumber(userNumberInt);
    	
    	
    	boolean b = UserInformationService.insert(user) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/user/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/user_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


