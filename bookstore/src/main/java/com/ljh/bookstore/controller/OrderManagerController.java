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

import com.ljh.bookstore.domain.OrderDomain;
import com.ljh.bookstore.sevice.impl.OrderService;

/**
 * 订单管理控制层
 * @author skj
 *
 */
public class OrderManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 订单管理服務層
	 */
	private OrderService OrderService = new OrderService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<OrderDomain> orderList = OrderService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("orderList", orderList); 	
    	
    	request.getRequestDispatcher("/manage/order_manager.jsp").forward(request, response); 
    }
}

























