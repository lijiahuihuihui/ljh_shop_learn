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

import com.ljh.bookstore.domain.BookClassifyDomain;
import com.ljh.bookstore.sevice.impl.BookClassifyService;

/**
 * 商品分类控制层
 * @author skj
 *
 */
public class ShopClassifyController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 商品分类服务层
	 */
	private BookClassifyService BookClassifyService = new BookClassifyService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<BookClassifyDomain> classifyList = BookClassifyService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("classifyList", classifyList); 	
    	
    	request.getRequestDispatcher("/manage/shop_classify.jsp").forward(request, response); 
    }
}

























