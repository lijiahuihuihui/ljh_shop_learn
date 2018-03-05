package com.ljh.bookstore.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ljh.bookstore.dao.imp.RoleDao;
import com.ljh.bookstore.domain.RoleDomain;

public class RoleDaoTest {
	
	RoleDao dao = new RoleDao();

	@Test
	public void testSelectById() {
		RoleDomain m = dao.selectById("c1e90bb7-a550-4762-8bd1-49c91afd0cc8")  ; 
		assertNotNull(m);
	}

	@Test
	public void testInsert() {
		RoleDomain t = new RoleDomain() ; 	
		
        t.setRoleName("vdsvk_"+System.currentTimeMillis());
        t.setRoleSex("ewfw");
        t.setRolePrivilege("wwf");
        
		boolean I = dao.insert(t) ; 
		
		assertTrue(I); 
	}

	@Test
	public void testSelectByPage() {
		int pageNow = 0 ; 
		int pageSize = 2 ; 
		
		List<RoleDomain> ms = dao.selectByPage(pageNow*pageSize , pageSize) ; 
		
		for(RoleDomain m : ms) {
			System.out.println("m = " + m.toString());
		}
	}

	@Test
	public void testDeleteById() {
		boolean m = dao.deleteById("cf3f211b-32c9-4cd5-ad39-c954cf461702")  ; 
		assertNotNull(m);
	}

	@Test
	public void testUpdate() {
		RoleDomain t = new RoleDomain() ; 
		t.setRoleId("c1e90bb7-a550-4762-8bd1-49c91afd0cc8");
        t.setRoleName("weerf");
        
		boolean i = dao.update(t) ; 
		System.out.println("i = " +i);
		assertTrue(i); 
	}

}
