package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.ShopInformationDao;
import com.ljh.bookstore.domain.ShopInformationDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class ShopInformationServicce implements IBaseService<ShopInformationDomain>{
	
	ShopInformationDao dao = new ShopInformationDao() ;

	public ShopInformationDomain selectById(String id) {
		ShopInformationDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(ShopInformationDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<ShopInformationDomain> selectByPage(int pageNow, int pageSize) {
		List<ShopInformationDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(ShopInformationDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
