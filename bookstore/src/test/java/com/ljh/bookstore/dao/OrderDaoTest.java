package com.ljh.bookstore.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.ljh.bookstore.dao.imp.OrderDao;
import com.ljh.bookstore.domain.OrderDomain;

public class OrderDaoTest {
	
	OrderDao dao = new OrderDao();

	@Test
	public void testSelectById() {
		OrderDomain m = dao.selectById("028c891d-ff94-4b70-8d9b-bc41f0c03fd9")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		OrderDomain t = new OrderDomain() ; 		
		
		t.setOrderInformationId("vdsvk_"+System.currentTimeMillis());
		t.setBookNum(3450);
		t.setBookPrice(3275);
		t.setBookPriceSum(4589);
		t.setOrderCondition("wuiirw");
		
		boolean v = dao.insert(t) ; 
		
		System.out.println("v = " +v);
		
		assertTrue(v); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<OrderDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(OrderDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("93740aac-bb9b-435d-acd7-48acb6830f93")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		OrderDomain t = new OrderDomain() ; 
		t.setOrderId("028c891d-ff94-4b70-8d9b-bc41f0c03fd9");
		t.setBookNum(28343);
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
