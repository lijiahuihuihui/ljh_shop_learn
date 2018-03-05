package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.OrderDao;
import com.ljh.bookstore.domain.OrderDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class OrderService implements IBaseService<OrderDomain>{

	OrderDao dao = new OrderDao() ;
	
	public OrderDomain selectById(String id) {
		OrderDomain m = dao.selectById(id) ; 
		return m ;
    }

	public boolean insert(OrderDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<OrderDomain> selectByPage(int pageNow, int pageSize) {
		List<OrderDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(OrderDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
