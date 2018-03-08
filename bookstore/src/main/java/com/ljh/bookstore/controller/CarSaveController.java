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

import com.ljh.bookstore.domain.ShopCollectionDomain;
import com.ljh.bookstore.sevice.impl.ShopCollectionService;

/**
 *购物车保存控制层
 * @author skj
 *
 */
public class CarSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 购物车服務層
	 */
	private ShopCollectionService ShopCollectionService = new ShopCollectionService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String bookId = request.getParameter("book_id") ; 
    	String userId = request.getParameter("user_id") ;  
    	
    	request.setAttribute("bookId", bookId); 
    	request.setAttribute("userId", userId); 
    	
    	System.out.println("bookId = " + bookId +" , userId = " + userId );
    	
    	if(bookId == null || "".equals(bookId)) {
    		errorMsg = "图书序号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/car_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(userId == null || "".equals(userId)) {
    		errorMsg = "用户账号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/car_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	ShopCollectionDomain car = new ShopCollectionDomain() ; 
    	car.setBookId(bookId);
    	car.setUserId(userId);
    	
    	
    	boolean b = ShopCollectionService.insert(car) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/car/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/car_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


