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

import com.ljh.bookstore.domain.ManagerDomain;
import com.ljh.bookstore.sevice.impl.ManagerService;

/**
 * 管理员管理控制层
 * @author skj
 *
 */
public class ManageManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 管理员管理服務層
	 */
	private ManagerService ManagerService = new ManagerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<ManagerDomain> manageList = ManagerService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("manageList", manageList); 	
    	
    	request.getRequestDispatcher("/manage/manage_manager.jsp").forward(request, response); 
    }
}

























