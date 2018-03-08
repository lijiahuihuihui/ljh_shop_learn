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

import com.ljh.bookstore.domain.ShopInformationDomain;
import com.ljh.bookstore.sevice.impl.ShopInformationServicce;

/**
 * 消费信心控制层
 * @author skj
 *
 */
public class MessageManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 消费信息服务层
	 */
	private ShopInformationServicce ShopInformationServicce = new ShopInformationServicce();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<ShopInformationDomain> messageList = ShopInformationServicce.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("messageList", messageList); 	
    	
    	request.getRequestDispatcher("/manage/message_manager.jsp").forward(request, response); 
    }
}

























