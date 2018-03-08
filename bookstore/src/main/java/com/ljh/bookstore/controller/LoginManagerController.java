/**
 * @author lijiahui
 *
 */
package com.ljh.bookstore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ljh.bookstore.domain.LoginInformationDomain;
import com.ljh.bookstore.sevice.impl.LoginInformationSercvice;

/**
 * 登陆记录控制层
 * @author skj
 *
 */
public class LoginManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 登陆记录服務層
	 */
	private LoginInformationSercvice LoginInformationSercvice = new LoginInformationSercvice();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<LoginInformationDomain> loginList = LoginInformationSercvice.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("loginList", loginList); 	
    	
    	request.getRequestDispatcher("/manage/login_manager.jsp").forward(request, response); 
    }
}

























