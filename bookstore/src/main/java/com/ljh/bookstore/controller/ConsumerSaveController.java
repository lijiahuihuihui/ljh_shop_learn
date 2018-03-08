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

import com.ljh.bookstore.domain.ConsumptionDomain;
import com.ljh.bookstore.sevice.impl.ConsumptionService;

/**
 * 消费记录保存控制层
 * @author skj
 *
 */
public class ConsumerSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 消费服務層
	 */
	private ConsumptionService ConsumptionService = new ConsumptionService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String conName = request.getParameter("con_name") ; 
    	String conMoney = request.getParameter("con_money") ; 
    	String bookId = request.getParameter("book_id") ; 
    	String userId = request.getParameter("user_id") ; 
    	
    	request.setAttribute("conName", conName); 
    	request.setAttribute("conMoney", conMoney);
    	request.setAttribute("bookId", bookId); 
    	request.setAttribute("userId", userId);
    	
    	System.out.println("conName = " + conName +" , conMoney = " + conMoney+" bookId = " + bookId +" , userId = " + userId );
    	
    	if(conName == null || "".equals(conName)) {
    		errorMsg = "消费商品名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/consumer_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(conMoney == null || "".equals(conMoney)) {
    		errorMsg = "消费金额不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/consumer_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookId == null || "".equals(bookId)) {
    		errorMsg = "图书序号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/consumer_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userId == null || "".equals(userId)) {
    		errorMsg = "用户账号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/consumer_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	ConsumptionDomain consumer = new ConsumptionDomain() ; 
    	consumer.setConName(conName);
    	consumer.setConMoney(conMoney);
    	consumer.setBookId(bookId);
    	consumer.setUserId(userId);
    	
    	
    	boolean b = ConsumptionService.insert(consumer) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/consumer/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/consumer_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


