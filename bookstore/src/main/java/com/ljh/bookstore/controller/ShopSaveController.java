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

import com.ljh.bookstore.domain.BookInformationDomain;
import com.ljh.bookstore.sevice.impl.BookInformationService;

/**
 * 商品保存控制层
 * @author skj
 *
 */
public class ShopSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 商品服务层
	 */
	private BookInformationService BookInformationService = new BookInformationService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String bookName = request.getParameter("book_name") ; 
    	String bookAuthor = request.getParameter("book_author") ; 
    	String bookPrice = request.getParameter("book_price") ; 
    	String bookPublish = request.getParameter("book_publish") ; 
    	String bookPages = request.getParameter("book_pages") ; 
    	String bookCondition = request.getParameter("book_condition") ; 
    	String classId = request.getParameter("class_id") ; 
    	String bookPicUrl = request.getParameter("book_pic_url") ; 
    	

    	
    	request.setAttribute("bookName", bookName); 
    	request.setAttribute("bookAuthor", bookAuthor); 
    	request.setAttribute("bookPrice", bookPrice); 
    	request.setAttribute("bookPublish", bookPublish); 
    	request.setAttribute("bookPages", bookPages); 
    	request.setAttribute("bookCondition", bookCondition); 
    	request.setAttribute("classId", classId); 
    	request.setAttribute("bookPicUrl", bookPicUrl); 
    	
    	System.out.println("bookName = " + bookName+" bookAuthor = " + bookAuthor+" bookPrice = " + bookPrice+" bookPublish = " + bookPublish+" bookPages = " + bookPages+" bookCondition = " + bookCondition+" classId = " + classId+" bookPicUrl = " + bookPicUrl);
    	
    	if(bookName == null || "".equals(bookName)) {
    		errorMsg = "图书名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shop_add.jsp").forward(request, response); 
    		return ; 
    	}   	
    	
    	if(bookAuthor == null || "".equals(bookAuthor)) {
    		errorMsg = "图书作者不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shop_add.jsp").forward(request, response); 
    		return ; 
    	}   	
    	
    	if(bookPrice == null || "".equals(bookPrice)) {
    		errorMsg = "图书单价不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shop_add.jsp").forward(request, response); 
    		return ; 
    	}   	
    	
    	if(bookCondition == null || "".equals(bookCondition)) {
    		errorMsg = "图书状态不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shop_add.jsp").forward(request, response); 
    		return ; 
    	}   	
    	
    	if(classId == null || "".equals(classId)) {
    		errorMsg = "分类序号不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shop_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(bookPicUrl == null || "".equals(bookPicUrl)) {
    		errorMsg = "图片地址不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shop_add.jsp").forward(request, response); 
    		return ; 
    	} 
    	
    	BookInformationDomain book = new BookInformationDomain() ; 
    	book.setBookName(bookName);
    	book.setBookAuthor(bookAuthor);
    	book.setBookPrice(bookPrice);
    	book.setBookPublish(bookPublish);
    	book.setBookPages(bookPages);
    	book.setBookCondition(bookCondition);
    	book.setClassId(classId);
    	book.setBookPicUrl(bookPicUrl);
    	
    	boolean b = BookInformationService.insert(book) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/shop/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失败,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shop_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


