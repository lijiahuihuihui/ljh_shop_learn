package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.domain.MenuDomain;

public class MenuDaoTest {
	
	MenuDao dao = new MenuDao(); 

	@Test
	public void testSelectById() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		
		MenuDomain t = new MenuDomain() ; 
		t.setMenuName("test_"+System.currentTimeMillis());
		
		boolean b = dao.insert(t) ; 
		
		assertTrue(b); 
		
	}

	@Test
	public void testSelectByPage() {
		
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<MenuDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(MenuDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
		
	}

	@Test
	public void testDeleteById() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
