package com.ljh.bookstore.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.ljh.bookstore.dao.imp.OrderInformationDao;
import com.ljh.bookstore.domain.OrderInformationDomain;

public class OrderInformationDaoTest {
	
	OrderInformationDao dao = new OrderInformationDao();

	@Test
	public void testSelectById() {
		OrderInformationDomain m = dao.selectById("69e09ed1-a8be-4319-91a7-39f8289466f3")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		OrderInformationDomain t = new OrderInformationDomain() ; 	
		
		t.setBookId("dwfwe");
		t.setBookName("vdsvk_"+System.currentTimeMillis());
		t.setBookNum(29382);
		t.setBookPrice(23847);
		t.setUserId("sdfs");
		t.setOrderId("vgwrw");

		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<OrderInformationDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(OrderInformationDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("8fd565cb-340a-4956-a2f0-9fc1d38b81b8")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		OrderInformationDomain t = new OrderInformationDomain() ; 
		t.setOrderInformationId("69e09ed1-a8be-4319-91a7-39f8289466f3");
        t.setBookName("gerge");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
