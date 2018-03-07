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
import com.ljh.bookstore.domain.LoginInformationDomain;
import com.ljh.bookstore.util.Util;

public class LoginInformationDao implements  IBaseDao<LoginInformationDomain>{
	Util db = new Util();

	public LoginInformationDomain selectById(String id) {
		String select = "SELECT * FROM login_information  where login_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   LoginInformationDomain m = new LoginInformationDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setLoginId(rs.getString("login_id"));
		        	m.setLoginName(rs.getString("login_name"));
		        	m.setLoginNum(rs.getInt("login_num"));
		        	m.setUserId(rs.getString("user_id"));
		        	return m ; 
		        	
		        }
		        
			 
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

	public boolean insert(LoginInformationDomain t) {
		String insert = "insert login_information(login_id , login_name,login_num, user_id,add_time) value(?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getLoginName());
			ps.setDouble(3, t.getLoginNum());
			ps.setString(4, t.getUserId());
			
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

	public List<LoginInformationDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM login_information  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<LoginInformationDomain> ms = new ArrayList<LoginInformationDomain>() ; 
			   
		        while(rs.next()){  
		        	LoginInformationDomain m = new LoginInformationDomain() ; 
		        	
		        	m.setLoginId(rs.getString("login_id"));
		        	m.setLoginName(rs.getString("login_name"));
		        	m.setLoginNum(rs.getInt("login_num"));
		        	m.setUserId(rs.getString("user_id"));
		        	
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
		String delete = "delete from login_information where login_id=?";
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

	public boolean update(LoginInformationDomain t) {
		String update = "update login_information set login_name =? where login_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getLoginName());
			ps.setString(2, t.getLoginId());

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