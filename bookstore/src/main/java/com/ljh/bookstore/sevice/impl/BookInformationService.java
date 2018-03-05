package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.BookInformationDao;
import com.ljh.bookstore.domain.BookInformationDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class BookInformationService implements IBaseService<BookInformationDomain>{
	
	BookInformationDao dao = new BookInformationDao() ;

	public BookInformationDomain selectById(String id) {
		BookInformationDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(BookInformationDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<BookInformationDomain> selectByPage(int pageNow, int pageSize) {
		List<BookInformationDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(BookInformationDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
