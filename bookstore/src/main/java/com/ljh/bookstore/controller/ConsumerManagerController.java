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

import com.ljh.bookstore.domain.ConsumptionDomain;
import com.ljh.bookstore.sevice.impl.ConsumptionService;

/**
 * 消费记录控制层
 * @author skj
 *
 */
public class ConsumerManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 消费记录服务层
	 */
	private ConsumptionService ConsumptionService = new ConsumptionService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<ConsumptionDomain> consumerList = ConsumptionService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("consumerList", consumerList); 	
    	
    	request.getRequestDispatcher("/manage/consumer_manager.jsp").forward(request, response); 
    }
}

























