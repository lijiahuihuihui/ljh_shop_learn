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

import com.ljh.bookstore.domain.ShopExplanationDomain;
import com.ljh.bookstore.sevice.impl.ShopExplanationService;

/**
 * 购物说明保存控制层
 * @author skj
 *
 */
public class ExplanationSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 购物说明服務層
	 */
	private ShopExplanationService ShopExplanationService = new ShopExplanationService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String shopProblem = request.getParameter("shop_problem") ; 
    	String shopAnswer = request.getParameter("shop_answer") ;  
    	
    	request.setAttribute("shopProblem", shopProblem); 
    	request.setAttribute("shopAnswer", shopAnswer); 
    	
    	System.out.println("shopProblem = " + shopProblem +" , shopAnswer = " + shopAnswer );
    	
    	if(shopProblem == null || "".equals(shopProblem)) {
    		errorMsg = "购物名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/explanation_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    	ShopExplanationDomain explanation = new ShopExplanationDomain() ; 
    	explanation.setShopProblem(shopProblem);
    	explanation.setShopAnswer(shopAnswer);
    	
    	
    	boolean b = ShopExplanationService.insert(explanation) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/explanation/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,请联系管理员"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/explanation_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


