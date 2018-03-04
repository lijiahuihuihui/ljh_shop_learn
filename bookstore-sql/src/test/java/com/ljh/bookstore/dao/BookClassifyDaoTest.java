package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.domain.BookClassifyDomain;
import com.ljh.bookstore.domain.MenuDomain;

public class BookClassifyDaoTest {

	BookClassifyDao dao = new BookClassifyDao(); 
	
	@Test
	public void testSelectById() {

		BookClassifyDomain m = dao.selectById("gdbdrntmy")  ; 
		assertNotNull(m);

	}

	@Test
	public void testInsert() {
		BookClassifyDomain t = new BookClassifyDomain() ; 		
        t.setClassName("Book_"+System.currentTimeMillis());
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {

		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<BookClassifyDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(BookClassifyDomain m : ms) {
			System.out.println("m = " + m.toString());
		}

	}

	@Test
	public void testDeleteById() {


		boolean m = dao.deleteById("dfwf")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {

		BookClassifyDomain t = new BookClassifyDomain() ; 
		t.setClassId("vwvw");
        t.setClassName("gggeg");
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
		
	}

}
