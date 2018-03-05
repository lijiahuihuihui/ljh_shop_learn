package com.ljh.bookstore.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.ljh.bookstore.dao.imp.UserInformationDao;
import com.ljh.bookstore.domain.UserInformationDomain;

public class UserInformationDaoTest {
	
	UserInformationDao dao = new UserInformationDao();

	@Test
	public void testSelectById() {
		UserInformationDomain m = dao.selectById("25673b65-0a7b-476c-af9d-3dd8c2a6e3c9")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		UserInformationDomain t = new UserInformationDomain() ; 		
        t.setUser_name("vdsvk_"+System.currentTimeMillis());
        t.setUser_sex("vdwufie");
        t.setUser_age(49735);
        t.setUser_password("hugoeh");
        t.setUser_address("feuier");
        t.setUser_number(329846283);

        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<UserInformationDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(UserInformationDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("433a3e8c-fc25-45f1-a582-0a2494de5d09")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		UserInformationDomain t = new UserInformationDomain() ; 
		t.setUser_id("25673b65-0a7b-476c-af9d-3dd8c2a6e3c9");
        t.setUser_name("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
