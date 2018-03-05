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
import com.ljh.bookstore.domain.ManagerDomain;
import com.ljh.bookstore.util.Util;

public class ManagerDao implements  IBaseDao<ManagerDomain>{

	Util db = new Util();
	public ManagerDomain selectById(String id) {
		String select = "SELECT * FROM manager  where manager_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   ManagerDomain m = new ManagerDomain() ; 
		        if(rs.next()){  
		        	
		         	m.setManagerId(rs.getString("manager_id"));
		        	m.setManagerName(rs.getString("manager_name"));
		        	m.setManagerSex(rs.getString("manager_sex"));
		        	m.setManagerAge(rs.getInt("manager_age"));
		        	m.setManagerPassword(rs.getString("manager_password"));
		        	m.setManagerNumber(rs.getInt("manager_number"));

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

	public boolean insert(ManagerDomain t) {
		String insert = "insert manager(manager_id , manager_name,manager_sex,manager_age,manager_password,manager_number , add_time) value(?,?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getManagerName());
			ps.setString(3, t.getManagerSex());
			ps.setDouble(4, t.getManagerAge());
			ps.setString(5, t.getManagerPassword());
			ps.setDouble(6, t.getManagerNumber());
			ps.setTimestamp(7, new Timestamp(System.currentTimeMillis()));

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

	public List<ManagerDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM manager  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<ManagerDomain> ms = new ArrayList<ManagerDomain>() ; 
			   
		        while(rs.next()){  
		        	ManagerDomain m = new ManagerDomain() ; 
		        	
		         	m.setManagerId(rs.getString("manager_id"));
		        	m.setManagerName(rs.getString("manager_name"));
		        	m.setManagerSex(rs.getString("manager_sex"));
		        	m.setManagerAge(rs.getInt("manager_age"));
		        	m.setManagerPassword(rs.getString("manager_password"));
		        	m.setManagerNumber(rs.getInt("manager_number"));
		        	
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
		String delete = "delete from manager where manager_id=?";
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

	public boolean update(ManagerDomain t) {
		String update = "update manager set manager_name =? where manager_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getManagerName());
			ps.setString(2,t.getManagerId());

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

	public ManagerDomain selectByUsernameAndPassword(String username, String password) {
		String select = "SELECT * FROM manager  where manager_name=? and manager_password=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, username);
			ps.setString(2, password);

			   ResultSet rs=ps.executeQuery();
			   ManagerDomain m = new ManagerDomain() ; 
		        if(rs.next()){  
		        	
		         	m.setManagerId(rs.getString("manager_id"));
		        	m.setManagerName(rs.getString("manager_name"));
		        	m.setManagerSex(rs.getString("manager_sex"));
		        	m.setManagerAge(rs.getInt("manager_age"));
		        	m.setManagerPassword(rs.getString("manager_password"));
		        	m.setManagerNumber(rs.getInt("manager_number"));

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

	
	
}
