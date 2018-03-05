package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.MenuDao;
import com.ljh.bookstore.domain.MenuDomain;

public class MenuDaoTest {
	
	MenuDao dao = new MenuDao(); 

	@Test
	public void testSelectById() {
		MenuDomain m = dao.selectById("4bf6bfe2-144a-4b47-abe0-be2024232768")  ; 
		assertNotNull(m);
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
		boolean m = dao.deleteById("5c41973d-dbbd-44e0-9048-9eb53e641315")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		MenuDomain t = new MenuDomain() ; 
		t.setId("87c79aa2-c13c-4589-b25b-aa2db1978297");
		t.setMenuName("duhwiufhwe");
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
