package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.UserInformationDao;
import com.ljh.bookstore.domain.UserInformationDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class UserInformationService implements IBaseService<UserInformationDomain>{
	
	UserInformationDao dao = new UserInformationDao() ;

	public UserInformationDomain selectById(String id) {
		UserInformationDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(UserInformationDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<UserInformationDomain> selectByPage(int pageNow, int pageSize) {
		List<UserInformationDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(UserInformationDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
