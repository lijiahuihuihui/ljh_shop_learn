package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.LoginInformationDao;
import com.ljh.bookstore.domain.LoginInformationDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class LoginInformationSercvice implements IBaseService<LoginInformationDomain>{
	
	LoginInformationDao dao = new LoginInformationDao() ;

	public LoginInformationDomain selectById(String id) {
		LoginInformationDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(LoginInformationDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<LoginInformationDomain> selectByPage(int pageNow, int pageSize) {
		List<LoginInformationDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(LoginInformationDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
