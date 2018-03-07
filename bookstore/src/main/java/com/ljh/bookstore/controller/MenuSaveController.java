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

import com.ljh.bookstore.domain.MenuDomain;
import com.ljh.bookstore.sevice.impl.MenuService;

/**
 * 菜单保存控制层
 * @author skj
 *
 */
public class MenuSaveController extends HttpServlet{

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
	}

	private static final long serialVersionUID = 1L;
	
	/**
	 * 菜单服务层
	 */
	private MenuService MenuService = new MenuService();

    /**
     * 处理保存数据
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String errorMsg = "" ; 
        
    	//接收表单数据 
    	String menuName = request.getParameter("menu_name") ; 

    	
    	request.setAttribute("menuName", menuName); 
    	
    	System.out.println("menu name = " + menuName);
    	
    	if(menuName == null || "".equals(menuName)) {
    		errorMsg = "菜单名称不能为空"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/menu_add.jsp").forward(request, response); 
    		return ; 
    	}   	
    	
    	
    	
    	MenuDomain menu = new MenuDomain() ; 
    	menu.setMenuName(menuName);
    	
    	boolean b = MenuService.insert(menu) ; 
    	if(b) {
    		//成功，則重定向至管理界面
    		response.sendRedirect("/manage/menu/manager");
    	}else {
    		// 否則返回添加頁面做修改
    		errorMsg = "添加失敗,請聯繫管理員"; 
    		request.setAttribute("errorMsg", errorMsg);
    		request.getRequestDispatcher("/manage/menu_add.jsp").forward(request, response); 
    		return ; 
    	}
    	
    }
}


