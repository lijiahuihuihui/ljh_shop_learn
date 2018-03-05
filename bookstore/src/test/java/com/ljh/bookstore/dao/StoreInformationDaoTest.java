package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.StoreInformationDao;
import com.ljh.bookstore.domain.StoreInformationDomain;

public class StoreInformationDaoTest {
	
	StoreInformationDao dao = new StoreInformationDao();

	@Test
	public void testSelectById() {
		StoreInformationDomain m = dao.selectById("374fe6ae-f150-46d6-87a9-5099bbf535eb")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		StoreInformationDomain t = new StoreInformationDomain() ;
		
		
        t.setStoreName("vdsvk_"+System.currentTimeMillis());
        t.setStoreAddress("ewfw");
        t.setStoreIntroduce("wwf");
        t.setStoreTelephone("ere");
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<StoreInformationDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(StoreInformationDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("fb2867d2-3eb1-4e0f-acaf-250d0ca1e4b9")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		StoreInformationDomain t = new StoreInformationDomain() ; 
		t.setStoreId("374fe6ae-f150-46d6-87a9-5099bbf535eb");
        t.setStoreName("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
