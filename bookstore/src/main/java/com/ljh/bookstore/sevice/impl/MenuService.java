package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.MenuDao;
import com.ljh.bookstore.domain.MenuDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class MenuService implements IBaseService<MenuDomain>{
	
	MenuDao dao = new MenuDao() ; 

	public MenuDomain selectById(String id) {
		MenuDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(MenuDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<MenuDomain> selectByPage(int pageNow, int pageSize) {

		List<MenuDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
		
	}

	public boolean deleteById(String id) {
		
		boolean d =dao.deleteById(id) ; 
		return d ;
		
	}

	public boolean update(MenuDomain t) {
		
		boolean u =dao.update(t) ; 
		return u ;
		
	}

}
