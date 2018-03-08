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

import com.ljh.bookstore.domain.LoginInformationDomain;
import com.ljh.bookstore.sevice.impl.LoginInformationSercvice;

/**
 * 登陆信息保存控制层
 * @author skj
 *
 */
public class LoginSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 登陆信息服務層
	 */
	private LoginInformationSercvice LoginInformationSercvice = new LoginInformationSercvice();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String loginName = request.getParameter("login_name") ; 
    	String loginNum = request.getParameter("login_num") ; 
    	String userId = request.getParameter("user_id") ; 
    	
    	request.setAttribute("loginName", loginName); 
    	request.setAttribute("loginNum", loginNum); 
    	request.setAttribute("userId", userId); 
    	
    	System.out.println("loginName= " + loginName +" , loginNum = " + loginNum +" , userId = " + userId);
    	
    	if(loginName == null || "".equals(loginName)) {
    		errorMsg = "登陆姓名不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/login_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(loginNum == null || "".equals(loginNum)) {
    		errorMsg = "登陆次数不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/login_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userId == null || "".equals(userId)) {
    		errorMsg = "用户账号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/login_add.jsp").forward(request, response); 
    		return ; 
    	} 
    	
    	int loginNumInt = 0 ; 
    	try {
    		loginNumInt = Integer.parseInt(loginNum) ; 
    	}catch(Exception e) {
    		errorMsg = "登陆次数只能是數字" ; 
    		return ; 
    	}
    	
    	LoginInformationDomain login = new LoginInformationDomain() ; 
    	login.setLoginName(loginName);
    	login.setLoginNum(loginNumInt);
    	login.setUserId(userId);
    	
    	boolean b = LoginInformationSercvice.insert(login) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/login/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/login_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


