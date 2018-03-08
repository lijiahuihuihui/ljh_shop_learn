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

import com.ljh.bookstore.domain.StoreInformationDomain;
import com.ljh.bookstore.sevice.impl.StoreInformationService;

/**
 * 店铺管理控制层
 * @author skj
 *
 */
public class StoreManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 店铺管理服務層
	 */
	private StoreInformationService StoreInformationService = new StoreInformationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<StoreInformationDomain> storeList = StoreInformationService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("storeList", storeList); 	
    	
    	request.getRequestDispatcher("/manage/store_manager.jsp").forward(request, response); 
    }
}

























