/**
 * @author lijiahui
 *
 */
package com.ljh.bookstore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ljh.bookstore.domain.ShopExplanationDomain;
import com.ljh.bookstore.sevice.impl.ShopExplanationService;

/**
 * 购物说明控制层
 * @author skj
 *
 */
public class ExplanationManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 购物说明服務層
	 */
	private ShopExplanationService ShopExplanationService = new ShopExplanationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<ShopExplanationDomain> explanationList = ShopExplanationService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("explanationList", explanationList); 	
    	
    	request.getRequestDispatcher("/manage/explanation_manager.jsp").forward(request, response); 
    }
}

























