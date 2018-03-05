package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.UrlDao;
import com.ljh.bookstore.domain.UrlDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class UrlService implements IBaseService<UrlDomain>{
	
	UrlDao dao = new UrlDao() ;

	public UrlDomain selectById(String id) {
		UrlDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(UrlDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<UrlDomain> selectByPage(int pageNow, int pageSize) {
		List<UrlDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(UrlDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
