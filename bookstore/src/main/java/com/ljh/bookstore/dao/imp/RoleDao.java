package com.ljh.bookstore.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ljh.bookstore.dao.IBaseDao;
import com.ljh.bookstore.domain.RoleDomain;
import com.ljh.bookstore.util.Util;

public class RoleDao implements  IBaseDao<RoleDomain>{

	Util db = new Util();
	public RoleDomain selectById(String id) {
		String select = "SELECT * FROM role  where role_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   RoleDomain m = new RoleDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setRoleId(rs.getString("role_id"));
		        	m.setRoleName(rs.getString("role_name"));
		        	m.setRoleSex(rs.getString("role_sex"));
		        	m.setRolePrivilege(rs.getString("role_privilege"));
		        	
		        }
		        return m ; 
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					Util.getClose(con);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean insert(RoleDomain t) {
		String insert = "insert role(role_id , role_name ,role_sex, role_privilege,add_time) value(?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getRoleName());
			ps.setString(3, t.getRoleSex());
			ps.setString(4, t.getRolePrivilege());
			ps.setTimestamp(5, new Timestamp(System.currentTimeMillis()));

			int i = ps.executeUpdate();
			if (i == 1) {

				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					Util.getClose(con);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;

	}

	public List<RoleDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM role  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<RoleDomain> ms = new ArrayList<RoleDomain>() ; 
			   
		        while(rs.next()){  
		        	RoleDomain m = new RoleDomain() ; 
		        	
		        	m.setRoleId(rs.getString("role_id"));
		        	m.setRoleName(rs.getString("role_name"));
		        	m.setRoleSex(rs.getString("role_sex"));
		        	m.setRolePrivilege(rs.getString("role_privilege"));
		        	
		        	ms.add(m) ; 
		        }
		        return ms ; 
			 
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null) {
					Util.getClose(con);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean deleteById(String id) {
		String delete = "delete from role where role_id=?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(delete);
			ps.setString(1, id);

			int i = ps.executeUpdate();
			if (i == 1) {

				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					Util.getClose(con);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean update(RoleDomain t) {
		String update = "update role set role_name =? where role_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(1, t.getRoleName());
			ps.setString(2, t.getRoleId());

			int i = ps.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					Util.getClose(con);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	

}
