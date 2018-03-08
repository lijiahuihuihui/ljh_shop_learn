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

import com.ljh.bookstore.domain.OrderInformationDomain;
import com.ljh.bookstore.sevice.impl.OrderInformationService;

/**
 * 个人订单保存控制层
 * @author skj
 *
 */
public class PorderSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 广告服務層
	 */
	private OrderInformationService OrderInformationService = new OrderInformationService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String bookId = request.getParameter("book_id") ; 
    	String bookName = request.getParameter("book_name") ;  
    	String bookNum = request.getParameter("book_num") ; 
    	String bookPrice = request.getParameter("book_price") ;
    	String userId = request.getParameter("user_id") ;
    	String orderId = request.getParameter("order_id") ;
    	
    	request.setAttribute("bookId", bookId); 
    	request.setAttribute("bookName", bookName);
    	request.setAttribute("bookNum", bookNum); 
    	request.setAttribute("bookPrice", bookPrice);
    	request.setAttribute("userId", userId);
    	request.setAttribute("orderId", orderId);
    	
    	System.out.println("bookId = " + bookId +" , bookName = " + bookName+" , bookPrice = " + bookPrice+" , userId = " + userId+" , orderId = "+orderId );
    	
    	if(bookId == null || "".equals(bookId)) {
    		errorMsg = "个人订单序号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/porder_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookName == null || "".equals(bookName)) {
    		errorMsg = "图书数量不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/porder_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookNum == null || "".equals(bookNum)) {
    		errorMsg = "所有图书总价不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/porder_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookPrice == null || "".equals(bookPrice)) {
    		errorMsg = "订单状态不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/porder_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userId == null || "".equals(userId)) {
    		errorMsg = "所有图书总价不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/porder_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(orderId == null || "".equals(orderId)) {
    		errorMsg = "订单状态不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/porder_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	int bookNumInt = 0 ; 
    	try {
    		bookNumInt = Integer.parseInt(bookNum) ; 
    	}catch(Exception e) {
    		errorMsg = "图书数量只能是數字" ; 
    		return ; 
    	}
    	
    	int bookPriceInt = 0 ; 
    	try {
    		bookPriceInt = Integer.parseInt(bookPrice) ; 
    	}catch(Exception e) {
    		errorMsg = "所有图书总价只能是數字" ; 
    		return ; 
    	}
    	
    	
    	OrderInformationDomain porder = new OrderInformationDomain() ; 
    	porder.setBookId(bookId);
    	porder.setBookName(bookName);
    	porder.setBookNum(bookNumInt);
    	porder.setBookPrice(bookPriceInt);
    	porder.setOrderId(orderId);
    	porder.setUserId(userId);
    	
    	boolean b = OrderInformationService.insert(porder) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/porder/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/porder_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


