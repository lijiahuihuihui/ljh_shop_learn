package com.ljh.bookstore.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.ljh.bookstore.dao.imp.LoginInformationDao;
import com.ljh.bookstore.domain.LoginInformationDomain;

public class LoginInformationDaoTest {

	LoginInformationDao dao = new LoginInformationDao();
	
	@Test
	public void testSelectById() {
		LoginInformationDomain m = dao.selectById("d36e8437-b37c-40e1-b28f-d06ead14690f")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		LoginInformationDomain t = new LoginInformationDomain() ; 		
		
		
        t.setLoginName("vdsvk_"+System.currentTimeMillis());
        t.setLoginNum(12);
        t.setUserId("bdwsge");

        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<LoginInformationDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(LoginInformationDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("0e4d46ae-022d-42e1-86f7-e1a18052d727")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		LoginInformationDomain t = new LoginInformationDomain() ; 
		t.setLoginId("d36e8437-b37c-40e1-b28f-d06ead14690f");
        t.setLoginName("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
