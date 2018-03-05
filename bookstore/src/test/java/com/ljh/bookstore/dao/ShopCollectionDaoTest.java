package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.ShopCollectionDao;
import com.ljh.bookstore.domain.ShopCollectionDomain;

public class ShopCollectionDaoTest {
	
	ShopCollectionDao dao = new ShopCollectionDao();

	@Test
	public void testSelectById() {
		ShopCollectionDomain m = dao.selectById("0e13567b-1d45-4fbe-b2c1-450238275dfe")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		ShopCollectionDomain t = new ShopCollectionDomain() ; 		
		t.setBookId("vdsvk_"+System.currentTimeMillis());
		t.setUserId("wffw");
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<ShopCollectionDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(ShopCollectionDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("c17dc4f7-2778-484c-a6ba-efde93d1126f")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		ShopCollectionDomain t = new ShopCollectionDomain() ; 
		t.setCollectionId("0e13567b-1d45-4fbe-b2c1-450238275dfe");
        t.setBookId("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
