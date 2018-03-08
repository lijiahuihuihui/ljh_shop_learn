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

import com.ljh.bookstore.domain.ShopCollectionDomain;
import com.ljh.bookstore.sevice.impl.ShopCollectionService;

/**
 * 购物车控制层
 * @author skj
 *
 */
public class CarManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 购物车服務層
	 */
	private ShopCollectionService ShopCollectionService = new ShopCollectionService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<ShopCollectionDomain> carList = ShopCollectionService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("carList", carList); 	
    	
    	request.getRequestDispatcher("/manage/car_manager.jsp").forward(request, response); 
    }
}

























