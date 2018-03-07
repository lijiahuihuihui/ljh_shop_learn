package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.AdvertisementDao;
import com.ljh.bookstore.domain.AdvertisementDomain;

public class AdvertisementDaoTest {

	AdvertisementDao dao = new AdvertisementDao(); 
	
	@Test
	public void testSelectById() {
		AdvertisementDomain m = dao.selectById("1791e5ae-a00b-414d-af27-0150c34a38176666")  ; 
	   System.out.println("m = "+m) ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {

		AdvertisementDomain t = new AdvertisementDomain() ; 		
        t.setAdvName("vdsv_"+System.currentTimeMillis());
        t.setAdvPicUrl("uwefhiwu"+System.currentTimeMillis());
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
		
	}

	@Test
	public void testSelectByPage() {

		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<AdvertisementDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(AdvertisementDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
		
	}

	@Test
	public void testDeleteById() {

		boolean m = dao.deleteById("1791e5ae-a00b-414d-af27-0150c34a3817")  ; 
		assertNotNull(m);
		
	}

	@Test
	public void testUpdate() {

		AdvertisementDomain t = new AdvertisementDomain() ; 
		t.setAdvId("89edb2d7-ad3e-4b06-8dcb-c964ac4de6eb");
        t.setAdvName("gggeg");
        t.setAdvPicUrl("duwghuiwh");
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
		
	}

}
