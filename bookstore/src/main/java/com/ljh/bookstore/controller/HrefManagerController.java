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

import com.ljh.bookstore.domain.UrlDomain;
import com.ljh.bookstore.sevice.impl.UrlService;

/**
 * 链接管理控制层
 * @author skj
 *
 */
public class HrefManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 鏈接服務層
	 */
	private UrlService urlService = new UrlService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<UrlDomain> urlList = urlService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("urlList", urlList); 	
    	
    	request.getRequestDispatcher("/manage/href_manager.jsp").forward(request, response); 
    }
}

























