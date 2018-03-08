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

import com.ljh.bookstore.domain.StoreInformationDomain;
import com.ljh.bookstore.sevice.impl.StoreInformationService;

/**
 * 广告保存控制层
 * @author skj
 *
 */
public class StoreSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 广告服務層
	 */
	private StoreInformationService StoreInformationService = new StoreInformationService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String storeName = request.getParameter("store_name") ; 
    	String storeAddress = request.getParameter("store_address") ; 
    	String storeIntroduce = request.getParameter("store_introduce") ; 
    	String storeTelephone = request.getParameter("store_telephone") ; 
    	
    	request.setAttribute("storeName", storeName); 
    	request.setAttribute("storeAddress", storeAddress); 
    	request.setAttribute("storeIntroduce", storeIntroduce); 
    	request.setAttribute("storeTelephone", storeTelephone); 
    	
    	System.out.println("storeName = " + storeName +" , storeAddress = " + storeAddress +" , storeIntroduce = " + storeIntroduce +" , storeTelephone = " + storeTelephone );
    	
    	
    	
    	if(storeName == null || "".equals(storeName)) {
    		errorMsg = "店铺名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/store_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(storeAddress == null || "".equals(storeAddress)) {
    		errorMsg = "店铺地址不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/store_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(storeIntroduce == null || "".equals(storeIntroduce)) {
    		errorMsg = "店铺介绍不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/store_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	if(storeTelephone == null || "".equals(storeTelephone)) {
    		errorMsg = "店铺电话不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/store_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	StoreInformationDomain store = new StoreInformationDomain() ; 
    	store.setStoreName(storeName);
    	store.setStoreAddress(storeAddress);
    	store.setStoreIntroduce(storeIntroduce);
    	store.setStoreTelephone(storeTelephone);
    	
    	
    	boolean b = StoreInformationService.insert(store) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/store/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/store_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


