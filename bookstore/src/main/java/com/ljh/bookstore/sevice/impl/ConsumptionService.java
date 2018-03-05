package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.ConsumptionDao;
import com.ljh.bookstore.domain.ConsumptionDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class ConsumptionService implements IBaseService<ConsumptionDomain>{
	
	ConsumptionDao dao = new ConsumptionDao() ;

	public ConsumptionDomain selectById(String id) {
		ConsumptionDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(ConsumptionDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
		}

	public List<ConsumptionDomain> selectByPage(int pageNow, int pageSize) {
		List<ConsumptionDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(ConsumptionDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
