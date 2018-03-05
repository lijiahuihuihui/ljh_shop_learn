package com.ljh.bookstore.sevice.impl;

import java.util.List;

import com.ljh.bookstore.dao.imp.AdvertisementDao;
import com.ljh.bookstore.domain.AdvertisementDomain;
import com.ljh.bookstore.sevice.IBaseService;

public class AdvertisementService implements IBaseService<AdvertisementDomain>{
	
	AdvertisementDao dao = new AdvertisementDao() ;

	public AdvertisementDomain selectById(String id) {
		AdvertisementDomain m = dao.selectById(id) ; 
		return m ;
	}

	public boolean insert(AdvertisementDomain t) {
		boolean i =dao.insert(t) ; 
		return i ;
	}

	public List<AdvertisementDomain> selectByPage(int pageNow, int pageSize) {
		List<AdvertisementDomain> s = dao.selectByPage(pageNow, pageSize) ; 
		return s ;
	}

	public boolean deleteById(String id) {
		boolean d =dao.deleteById(id) ; 
		return d ;
	}

	public boolean update(AdvertisementDomain t) {
		boolean u =dao.update(t) ; 
		return u ;
	}

}
