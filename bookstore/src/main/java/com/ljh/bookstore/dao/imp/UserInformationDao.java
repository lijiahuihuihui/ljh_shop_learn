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
import com.ljh.bookstore.domain.UserInformationDomain;
import com.ljh.bookstore.util.Util;

public class UserInformationDao implements  IBaseDao<UserInformationDomain>{

	Util db = new Util();
	public UserInformationDomain selectById(String id) {
		String select = "SELECT * FROM user_information  where user_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   UserInformationDomain m = new UserInformationDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setUserId(rs.getString("user_id"));
		        	m.setUserName(rs.getString("user_name"));
		        	m.setUserSex(rs.getString("user_sex"));
		        	m.setUserAge(rs.getInt("user_age"));
		        	m.setUserPassword(rs.getString("user_password"));
		        	m.setUserAddress(rs.getString("user_address"));
		        	m.setUserNumber(rs.getInt("user_number"));
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

	public boolean insert(UserInformationDomain t) {
		String insert = "insert user_information(user_id , user_name , user_sex , user_age , user_password , user_address , user_number , add_time) value(?,?,?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getUserName());
			ps.setString(3, t.getUserSex());
			ps.setDouble(4, t.getUserAge());
			ps.setString(5, t.getUserPassword());
			ps.setString(6, t.getUserAddress());
			ps.setDouble(7, t.getUserNumber());
			ps.setTimestamp(8, new Timestamp(System.currentTimeMillis()));

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

	public List<UserInformationDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM user_information  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<UserInformationDomain> ms = new ArrayList<UserInformationDomain>() ; 
			   
		        while(rs.next()){  
		        	UserInformationDomain m = new UserInformationDomain() ; 
		        	
		        	m.setUserId(rs.getString("user_id"));
		        	m.setUserName(rs.getString("user_name"));
		        	m.setUserSex(rs.getString("user_sex"));
		        	m.setUserAge(rs.getInt("user_age"));
		        	m.setUserPassword(rs.getString("user_password"));
		        	m.setUserAddress(rs.getString("user_address"));
		        	m.setUserNumber(rs.getInt("user_number"));
		        	
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
		String delete = "delete from user_information where user_id=?";
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

	public boolean update(UserInformationDomain t) {
		String update = "update user_information set user_name =? where user_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getUserName());
			ps.setString(2, t.getUserId());

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
