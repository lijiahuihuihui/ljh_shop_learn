package com.ljh.bookstore.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.ljh.bookstore.dao.imp.ConsumptionDao;
import com.ljh.bookstore.domain.ConsumptionDomain;

public class ConsumptionDaoTest {
	
	ConsumptionDao dao = new ConsumptionDao();

	@Test
	public void testSelectById() {
		ConsumptionDomain m = dao.selectById("024842a9-b666-4f14-936b-266cf5560ed5")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		ConsumptionDomain t = new ConsumptionDomain() ; 		
        t.setConName("vdsvk_"+System.currentTimeMillis());
        t.setConMoney("ewfw");
        t.setBookId("wwf");
        t.setUserId("ere");
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<ConsumptionDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(ConsumptionDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("2042c0db-e197-47e8-b4b3-04b2f59a9a8b")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		ConsumptionDomain t = new ConsumptionDomain() ; 
		t.setConId("024842a9-b666-4f14-936b-266cf5560ed5");
        t.setConName("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
