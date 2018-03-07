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

import com.ljh.bookstore.domain.UrlDomain;
import com.ljh.bookstore.sevice.impl.UrlService;

/**
 * 友情链接保存控制层
 * @author skj
 *
 */
public class HrefSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 鏈接服務層
	 */
	private UrlService urlService = new UrlService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String hrefName = request.getParameter("href_name") ; 
    	String hrefUrl = request.getParameter("href_url") ; 
    	String hrefSort = request.getParameter("href_sort") ; 
    	
    	request.setAttribute("hrefName", hrefName); 
    	request.setAttribute("hrefUrl", hrefUrl); 
    	request.setAttribute("hrefSort", hrefSort); 
    	
    	System.out.println("href name = " + hrefName +" , href url = " + hrefUrl +" , href sort = " + hrefSort);
    	
    	if(hrefName == null || "".equals(hrefName)) {
    		errorMsg = "链接名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/href_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(hrefUrl == null || "".equals(hrefUrl)) {
    		errorMsg = "链接地址不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/href_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(hrefSort == null || "".equals(hrefSort)) {
    		errorMsg = "链接排序不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/href_add.jsp").forward(request, response); 
    		return ; 
    	} 
    	
    	int hrefSortInt = 0 ; 
    	try {
    		hrefSortInt = Integer.parseInt(hrefSort) ; 
    	}catch(Exception e) {
    		errorMsg = "链接排序只能是數字" ; 
    		return ; 
    	}
    	
    	UrlDomain url = new UrlDomain() ; 
    	url.setUrl(hrefUrl);
    	url.setUrlName(hrefName);
    	url.setUrlSort(hrefSortInt); 
    	
    	boolean b = urlService.insert(url) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/href/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/href_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


