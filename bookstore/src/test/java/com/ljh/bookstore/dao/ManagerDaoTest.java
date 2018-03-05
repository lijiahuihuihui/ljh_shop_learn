package com.ljh.bookstore.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.ljh.bookstore.dao.imp.ManagerDao;
import com.ljh.bookstore.domain.ManagerDomain;

public class ManagerDaoTest {
	
	ManagerDao dao = new ManagerDao();

	@Test
	public void testSelectById() {
		ManagerDomain m = dao.selectById("7effb4b3-8b5a-4c36-9d29-ca6e658593b2")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		ManagerDomain t = new ManagerDomain() ;
		
		t.setManagerName("fgs_"+System.currentTimeMillis());
		t.setManagerSex("dfiwu");
	    t.setManagerAge(23972);
	    t.setManagerPassword("fiwheifu");
	    t.setManagerNumber(2947382);
	    
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<ManagerDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(ManagerDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("24b80417-3434-430c-b66a-f5f277038cd2")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		ManagerDomain t = new ManagerDomain() ; 
		
        t.setManagerId("7effb4b3-8b5a-4c36-9d29-ca6e658593b2");
        t.setManagerName("ewufhiw");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
