package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.ShopCollectionDao;
import com.ljh.bookstore.domain.ShopCollectionDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class ShopCollectionService implements IBaseService<ShopCollectionDomain>{
	
	ShopCollectionDao dao = new ShopCollectionDao() ;

	public ShopCollectionDomain selectById(String id) {
		ShopCollectionDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(ShopCollectionDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<ShopCollectionDomain> selectByPage(int pageNow, int pageSize) {
		List<ShopCollectionDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(ShopCollectionDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
