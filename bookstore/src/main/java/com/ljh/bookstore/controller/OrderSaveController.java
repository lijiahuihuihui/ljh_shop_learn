/**
 * @author lijiahui
 *
 */
package com.ljh.bookstore.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ljh.bookstore.domain.OrderDomain;
import com.ljh.bookstore.sevice.impl.OrderService;

/**
 * 广告保存控制层
 * @author skj
 *
 */
public class OrderSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 广告服務層
	 */
	private OrderService OrderService = new OrderService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String orderInformationId = request.getParameter("order_information_id") ; 
    	String bookNum = request.getParameter("book_num") ;  
    	String bookPriceSum = request.getParameter("book_price_sum") ; 
    	String orderCondition = request.getParameter("order_condition") ;  
    	
    	request.setAttribute("orderInformationId", orderInformationId); 
    	request.setAttribute("bookNum", bookNum);
    	request.setAttribute("bookPriceSum", bookPriceSum); 
    	request.setAttribute("orderCondition", orderCondition);
    	
    	System.out.println("orderInformationId = " + orderInformationId +" , bookNum = " + bookNum+" , bookPriceSum = " + bookPriceSum+" , orderCondition = " + orderCondition );
    	
    	if(orderInformationId == null || "".equals(orderInformationId)) {
    		errorMsg = "个人订单序号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/order_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookNum == null || "".equals(bookNum)) {
    		errorMsg = "图书数量不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/order_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookPriceSum == null || "".equals(bookPriceSum)) {
    		errorMsg = "所有图书总价不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/order_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(orderCondition == null || "".equals(orderCondition)) {
    		errorMsg = "订单状态不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/order_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	int bookNumInt = 0 ; 
    	try {
    		bookNumInt = Integer.parseInt(bookNum) ; 
    	}catch(Exception e) {
    		errorMsg = "图书数量只能是數字" ; 
    		return ; 
    	}
    	
    	int bookPriceSumInt = 0 ; 
    	try {
    		bookPriceSumInt = Integer.parseInt(bookPriceSum) ; 
    	}catch(Exception e) {
    		errorMsg = "所有图书总价只能是數字" ; 
    		return ; 
    	}
    	
    	
    	OrderDomain order = new OrderDomain() ; 
    	order.setOrderInformationId(orderInformationId);
    	order.setBookNum(bookNumInt);
    	order.setBookPriceSum(bookPriceSumInt);
    	order.setOrderCondition(orderCondition);
    	
    	boolean b = OrderService.insert(order) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/order/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/order_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


