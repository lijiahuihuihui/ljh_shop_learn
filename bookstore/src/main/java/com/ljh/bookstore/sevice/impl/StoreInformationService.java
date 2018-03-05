package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.StoreInformationDao;
import com.ljh.bookstore.domain.StoreInformationDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class StoreInformationService implements IBaseService<StoreInformationDomain>{
	
	StoreInformationDao dao = new StoreInformationDao() ;

	public StoreInformationDomain selectById(String id) {
		StoreInformationDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(StoreInformationDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<StoreInformationDomain> selectByPage(int pageNow, int pageSize) {
		List<StoreInformationDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(StoreInformationDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
