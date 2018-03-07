package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.UrlDao;
import com.ljh.bookstore.domain.UrlDomain;

public class UrlDaoTest {
	
	UrlDao dao = new UrlDao();

	@Test
	public void testSelectById() {
		UrlDomain m = dao.selectById("b4049616-11d2-4e7c-96ff-f78ef54642d4")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		UrlDomain t = new UrlDomain() ; 		
        t.setUrlName("vdsvk_"+System.currentTimeMillis());
        t.setUrl("ewfw");
        t.setUrlSort(384972);
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<UrlDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(UrlDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("fc9970f5-9527-49dc-ba6e-1f899955b68b")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		UrlDomain t = new UrlDomain() ; 
		t.setUrlId("b4049616-11d2-4e7c-96ff-f78ef54642d4");
        t.setUrlName("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
