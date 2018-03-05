package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.ShopExplanationDao;
import com.ljh.bookstore.domain.ShopExplanationDomain;

public class ShopExplanationDaoTest {
	
	ShopExplanationDao dao = new ShopExplanationDao();

	@Test
	public void testSelectById() {
		ShopExplanationDomain m = dao.selectById("8d619002-aa26-4d69-8384-d4ea718eecc2")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		ShopExplanationDomain t = new ShopExplanationDomain() ; 	
		
		t.setShop_problem("vdsvk_"+System.currentTimeMillis());
		t.setShop_answer("vdsdfhiwk_"+System.currentTimeMillis());
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<ShopExplanationDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(ShopExplanationDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("f641bc70-763e-4ae4-8ad6-fa87cc452d66")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		ShopExplanationDomain t = new ShopExplanationDomain() ; 
		t.setShop_problem_id("8d619002-aa26-4d69-8384-d4ea718eecc2");
        t.setShop_problem("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
