/**
 * 
 */
/**
 * @author lijiahui
 *
 */
package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.BookClassifyDao;
import com.ljh.bookstore.domain.BookClassifyDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class BookClassifyService implements IBaseService<BookClassifyDomain>{
	
	BookClassifyDao dao = new BookClassifyDao() ;

	public BookClassifyDomain selectById(String id) {
		BookClassifyDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(BookClassifyDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<BookClassifyDomain> selectByPage(int pageNow, int pageSize) {
		List<BookClassifyDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
		
	}

	public boolean update(BookClassifyDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	} 
	
}