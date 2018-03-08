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

import com.ljh.bookstore.domain.AdvertisementDomain;
import com.ljh.bookstore.sevice.impl.AdvertisementService;

/**
 * 广告管理控制层
 * @author skj
 *
 */
public class AdvertisementManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 广告服務層
	 */
	private AdvertisementService AdvertisementService = new AdvertisementService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<AdvertisementDomain> advertisementList = AdvertisementService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("advertisementList", advertisementList); 	
    	
    	request.getRequestDispatcher("/manage/advertisement_manager.jsp").forward(request, response); 
    }
}

























