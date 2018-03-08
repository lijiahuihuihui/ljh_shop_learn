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

import com.ljh.bookstore.domain.BookInformationDomain;
import com.ljh.bookstore.sevice.impl.BookInformationService;

/**
 * 图书管理控制层
 * @author skj
 *
 */
public class ShopManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 图书服务层
	 */
	private BookInformationService BookInformationService = new BookInformationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<BookInformationDomain> shopList = BookInformationService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("shopList", shopList); 	
    	
    	request.getRequestDispatcher("/manage/shop_manager.jsp").forward(request, response); 
    }
}

























