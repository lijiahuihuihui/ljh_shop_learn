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

import com.ljh.bookstore.domain.ShopInformationDomain;
import com.ljh.bookstore.sevice.impl.ShopInformationServicce;

/**
 * 消费信息保存控制层
 * @author skj
 *
 */
public class MessageSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 消费信息服务层
	 */
	private ShopInformationServicce ShopInformationServicce = new ShopInformationServicce();

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
    	String bookPriceSum = request.getParameter("book_price_sum") ; 
    	String userId = request.getParameter("user_id") ;
    	
    	request.setAttribute("bookId", bookId); 
    	request.setAttribute("bookName", bookName);
    	request.setAttribute("bookNum", bookNum); 
    	request.setAttribute("bookPrice", bookPrice);
    	request.setAttribute("bookPriceSum", bookPriceSum); 
    	request.setAttribute("userId", userId);
    	
    	System.out.println("bookId = " + bookId +" , bookName = " + bookName+" , bookNum = " + bookNum+" , bookPrice = " + bookPrice+" , bookPriceSum = " + bookPriceSum+" , userId = " + userId );
    	
    	if(bookId == null || "".equals(bookId)) {
    		errorMsg = "图书序号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/message_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookName == null || "".equals(bookName)) {
    		errorMsg = "图书名字不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/message_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookNum == null || "".equals(bookNum)) {
    		errorMsg = "图书数量不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/message_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookPrice == null || "".equals(bookPrice)) {
    		errorMsg = "图书单价不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/message_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookPriceSum == null || "".equals(bookPriceSum)) {
    		errorMsg = "所有图书总价不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/message_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userId == null || "".equals(userId)) {
    		errorMsg = "用户账号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/message_add.jsp").forward(request, response); 
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
    		errorMsg = "图书单价只能是數字" ; 
    		return ; 
    	}
    	
    	int bookPriceSumInt = 0 ; 
    	try {
    		bookPriceSumInt = Integer.parseInt(bookPriceSum) ; 
    	}catch(Exception e) {
    		errorMsg = "所有图书总价只能是数字" ; 
    		return ; 
    	}
    	
    	ShopInformationDomain message = new ShopInformationDomain() ; 
    	message.setBookId(bookId);
    	message.setBookName(bookName);
    	message.setBookNum(bookNumInt);
    	message.setBookPrice(bookPriceInt);
    	message.setBookPriceSum(bookPriceSumInt);
    	message.setUserId(userId);
    	
    	boolean b = ShopInformationServicce.insert(message) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/message/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/message_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


