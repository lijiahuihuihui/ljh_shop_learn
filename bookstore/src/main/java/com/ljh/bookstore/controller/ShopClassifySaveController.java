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

import com.ljh.bookstore.domain.BookClassifyDomain;
import com.ljh.bookstore.sevice.impl.BookClassifyService;

/**
 * 商品保存控制层
 * @author skj
 *
 */
public class ShopClassifySaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 商品服务层
	 */
	private BookClassifyService BookClassifyService = new BookClassifyService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String className = request.getParameter("class_name") ; 
    	
    	request.setAttribute("className", className);    	
    	System.out.println("className = " + className);
    	
    	if(className == null || "".equals(className)) {
    		errorMsg = "分类名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shopclassify_add.jsp").forward(request, response); 
    		return ; 
    	}   	    	
    	
    	BookClassifyDomain classify = new BookClassifyDomain() ; 
    	classify.setClassName(className);
    	   	
    	boolean b = BookClassifyService.insert(classify) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/shop/classify");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失败,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/shopclassify_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


