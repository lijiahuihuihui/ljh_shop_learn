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
		        	
		        	m.setUser_id(rs.getString("user_id"));
		        	m.setUser_name(rs.getString("user_name"));
		        	m.setUser_sex(rs.getString("user_sex"));
		        	m.setUser_age(rs.getInt("user_age"));
		        	m.setUser_password(rs.getString("user_password"));
		        	m.setUser_address(rs.getString("user_address"));
		        	m.setUser_number(rs.getInt("user_number"));
		        	
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

	public boolean insert(UserInformationDomain t) {
		String insert = "insert user_information(user_id , user_name , user_sex , user_age , user_password , user_address , user_number , add_time) value(?,?,?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getUser_name());
			ps.setString(3, t.getUser_sex());
			ps.setDouble(4, t.getUser_age());
			ps.setString(5, t.getUser_password());
			ps.setString(6, t.getUser_address());
			ps.setDouble(7, t.getUser_number());
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
		        	
		        	m.setUser_id(rs.getString("user_id"));
		        	m.setUser_name(rs.getString("user_name"));
		        	m.setUser_sex(rs.getString("user_sex"));
		        	m.setUser_age(rs.getInt("user_age"));
		        	m.setUser_password(rs.getString("user_password"));
		        	m.setUser_address(rs.getString("user_address"));
		        	m.setUser_number(rs.getInt("user_number"));
		        	
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
			
			ps.setString(1, t.getUser_name());
			ps.setString(2, t.getUser_id());

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
