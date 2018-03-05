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

public class LoginValidateController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    private ManagerService managerService = new ManagerService() ; 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String username = request.getParameter("username") ; 
    	String password = request.getParameter("password") ; 
    	
    	System.out.println("username = "+username +" , password = " + password);
    	ManagerDomain manager = managerService.selectByUsernameAndPassword(username , password) ; 
    	
    	System.out.println("manager = " + manager);
    	
    	if(manager == null) {
    		 response.sendRedirect("manage/login.jsp");
    	}else {
    		 response.sendRedirect("manage/dashboard.jsp");
    	}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response); 
    } 
}


