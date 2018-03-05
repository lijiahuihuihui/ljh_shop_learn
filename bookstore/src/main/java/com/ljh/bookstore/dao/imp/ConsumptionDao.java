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
import com.ljh.bookstore.domain.ConsumptionDomain;
import com.ljh.bookstore.util.Util;

public class ConsumptionDao implements  IBaseDao<ConsumptionDomain>{

	Util db = new Util();
	public ConsumptionDomain selectById(String id) {
		String select = "SELECT * FROM consumption  where con_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   ConsumptionDomain m = new ConsumptionDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setConId(rs.getString("con_id"));
		        	m.setConName(rs.getString("con_name"));
		        	m.setConMoney(rs.getString("con_money"));
		        	m.setBookId(rs.getString("user_id"));
		        	m.setUserId(rs.getString("add_time"));

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

	public boolean insert(ConsumptionDomain t) {
		String insert = "insert consumption(con_id , con_name,con_money,book_id,user_id, add_time) value(?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getConName());
			ps.setString(3, t.getConMoney());
			ps.setString(4, t.getBookId());
			ps.setString(5, t.getUserId());
			ps.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

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

	public List<ConsumptionDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM consumption  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<ConsumptionDomain> ms = new ArrayList<ConsumptionDomain>() ; 
			   
		        while(rs.next()){  
		        	ConsumptionDomain m = new ConsumptionDomain() ; 
		        	
		        	m.setConId(rs.getString("con_id"));
		        	m.setConName(rs.getString("con_name"));
		        	m.setConMoney(rs.getString("con_money"));
		        	m.setBookId(rs.getString("user_id"));
		        	m.setUserId(rs.getString("add_time"));
		        	
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
		String delete = "delete from consumption where con_id=?";
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

	public boolean update(ConsumptionDomain t) {
		String update = "update consumption set con_name =? where con_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getConName());
			ps.setString(2, t.getConId());

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
