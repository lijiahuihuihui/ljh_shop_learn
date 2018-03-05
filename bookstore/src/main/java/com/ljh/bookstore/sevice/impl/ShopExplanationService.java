package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.ShopExplanationDao;
import com.ljh.bookstore.domain.ShopExplanationDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class ShopExplanationService implements IBaseService<ShopExplanationDomain>{
	
	ShopExplanationDao dao = new ShopExplanationDao() ;

	public ShopExplanationDomain selectById(String id) {
		ShopExplanationDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(ShopExplanationDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<ShopExplanationDomain> selectByPage(int pageNow, int pageSize) {
		List<ShopExplanationDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(ShopExplanationDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
