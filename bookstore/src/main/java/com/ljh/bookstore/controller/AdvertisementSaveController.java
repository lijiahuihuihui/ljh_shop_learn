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

import com.ljh.bookstore.domain.AdvertisementDomain;
import com.ljh.bookstore.sevice.impl.AdvertisementService;

/**
 * 广告保存控制层
 * @author skj
 *
 */
public class AdvertisementSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 广告服務層
	 */
	private AdvertisementService AdvertisementService = new AdvertisementService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String advName = request.getParameter("adv_name") ; 
    	String advPicUrl = request.getParameter("adv_pic_url") ;  
    	
    	request.setAttribute("advName", advName); 
    	request.setAttribute("advPicUrl", advPicUrl); 
    	
    	System.out.println("advName = " + advName +" , advPicUrl = " + advPicUrl );
    	
    	if(advName == null || "".equals(advName)) {
    		errorMsg = "广告名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/advertisement_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(advPicUrl == null || "".equals(advPicUrl)) {
    		errorMsg = "广告地址不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/advertisement_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	AdvertisementDomain advertisement = new AdvertisementDomain() ; 
    	advertisement.setAdvName(advName);
    	advertisement.setAdvPicUrl(advPicUrl);
    	
    	
    	boolean b = AdvertisementService.insert(advertisement) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/advertisement/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/advertisement_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


