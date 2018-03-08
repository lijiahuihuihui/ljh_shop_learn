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

import com.ljh.bookstore.domain.UserInformationDomain;
import com.ljh.bookstore.sevice.impl.UserInformationService;

/**
 * 用户信息控制层
 * @author skj
 *
 */
public class UserManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 用户信息服務層
	 */
	private UserInformationService UserInformationService = new UserInformationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<UserInformationDomain> userList = UserInformationService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("userList", userList); 	
    	
    	request.getRequestDispatcher("/manage/user_manager.jsp").forward(request, response); 
    }
}

























