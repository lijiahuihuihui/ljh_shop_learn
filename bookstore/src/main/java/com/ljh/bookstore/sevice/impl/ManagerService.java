package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.ManagerDao;
import com.ljh.bookstore.domain.ManagerDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class ManagerService implements IBaseService<ManagerDomain>{
	
	ManagerDao dao = new ManagerDao() ;

	public ManagerDomain selectById(String id) {
		ManagerDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(ManagerDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<ManagerDomain> selectByPage(int pageNow, int pageSize) {
		List<ManagerDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(ManagerDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

	public ManagerDomain selectByUsernameAndPassword(String username, String password) {
		ManagerDomain manager = dao.selectByUsernameAndPassword(username , password) ; 
		return manager ;
	}

}
