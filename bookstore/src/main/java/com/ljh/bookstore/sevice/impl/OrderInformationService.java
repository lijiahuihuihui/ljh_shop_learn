package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.OrderInformationDao;
import com.ljh.bookstore.domain.OrderInformationDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class OrderInformationService implements IBaseService<OrderInformationDomain>{
	
	OrderInformationDao dao = new OrderInformationDao() ;

	public OrderInformationDomain selectById(String id) {
		OrderInformationDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(OrderInformationDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<OrderInformationDomain> selectByPage(int pageNow, int pageSize) {
		List<OrderInformationDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(OrderInformationDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
