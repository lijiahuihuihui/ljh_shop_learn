package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.RoleDao;
import com.ljh.bookstore.domain.RoleDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class RoleService implements IBaseService<RoleDomain>{
	
	RoleDao dao = new RoleDao() ;

	public RoleDomain selectById(String id) {
		RoleDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(RoleDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<RoleDomain> selectByPage(int pageNow, int pageSize) {
		List<RoleDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(RoleDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
