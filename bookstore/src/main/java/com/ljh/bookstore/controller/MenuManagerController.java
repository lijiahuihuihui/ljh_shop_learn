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

import com.ljh.bookstore.domain.MenuDomain;
import com.ljh.bookstore.sevice.impl.MenuService;

/**
 * 菜单管理控制层
 * @author skj
 *
 */
public class MenuManagerController extends HttpServlet{

    private static final long serialVersionUID = 1L;
    
    /**
	 * 菜单服务层
	 */
	private MenuService MenuService = new MenuService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String pageNowStr = request.getParameter("pageNow") ; 
    	
    	int pageNow = (pageNowStr == null||"".equals(pageNowStr))?0:Integer.parseInt(pageNowStr)-1 ; 
    	int pageSize = 10 ;
    	
    	request.setAttribute("currentPage", pageNow+1); 
    	
    	List<MenuDomain> menuList = MenuService.selectByPage(pageNow*pageSize, pageSize) ;
    	request.setAttribute("menuList", menuList); 	
    	
    	request.getRequestDispatcher("/manage/menu_manager.jsp").forward(request, response); 
    }
}

























