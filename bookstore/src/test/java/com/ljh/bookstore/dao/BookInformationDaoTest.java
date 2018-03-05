package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.BookInformationDao;
import com.ljh.bookstore.domain.BookInformationDomain;

public class BookInformationDaoTest {

	BookInformationDao dao = new BookInformationDao(); 
	
	@Test
	public void testSelectById() {
		BookInformationDomain m = dao.selectById("7407766e-e8f2-427f-b41c-d838789eac73")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		BookInformationDomain t = new BookInformationDomain() ; 		
        t.setBookName("vdsvk_"+System.currentTimeMillis());
        t.setBookAuthor("vdsiw");
        t.setBookPrice("ewuew");
        t.setBookPublish("dvuwih");
        t.setBookPages("weuiw");
        t.setBookCondition("vnwuiv");
        t.setClassId("nwuivn");
        t.setBookPicUrl("cwniucw");
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<BookInformationDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(BookInformationDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("7407766e-e8f2-427f-b41c-d838789eac73")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		BookInformationDomain t = new BookInformationDomain() ; 
		t.setBookId("bacb0cef-1d56-4f96-966a-e86fccb75d74");
        t.setBookName("gggeg");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
