package com.ljh.bookstore.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.ljh.bookstore.dao.imp.ShopInformationDao;
import com.ljh.bookstore.domain.ShopInformationDomain;

public class ShopInformationDaoTest {
	
	ShopInformationDao dao = new ShopInformationDao();

	@Test
	public void testSelectById() {
		ShopInformationDomain m = dao.selectById("095f212d-9b3d-4734-a216-6e61eaf24afb")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		ShopInformationDomain t = new ShopInformationDomain() ; 		
		
		t.setBookId("sfgwgf"+System.currentTimeMillis());
		t.setBookNum(43289);
		t.setBookPrice(3285);
		t.setBookPriceSum(3258239);
        t.setBookName("vdsvk_"+System.currentTimeMillis());
        t.setUserId("wdfwefw");
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<ShopInformationDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(ShopInformationDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("ce8ecae8-cf7d-4170-9436-a6530af5eded")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		ShopInformationDomain t = new ShopInformationDomain() ; 
		t.setInformationId("095f212d-9b3d-4734-a216-6e61eaf24afb");
        t.setBookName("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
