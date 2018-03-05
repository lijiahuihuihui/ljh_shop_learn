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
import com.ljh.bookstore.domain.OrderInformationDomain;
import com.ljh.bookstore.util.Util;

public class OrderInformationDao implements  IBaseDao<OrderInformationDomain>{

	Util db = new Util();
	public OrderInformationDomain selectById(String id) {
		String select = "SELECT * FROM order_information  where order_information_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   OrderInformationDomain m = new OrderInformationDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setBookId(rs.getString("book_id"));
		        	m.setBookName(rs.getString("book_name"));
		        	m.setBookNum(rs.getInt("book_num"));
		        	m.setBookPrice(rs.getInt("book_price"));
		        	m.setOrderInformationId(rs.getString("order_information_id"));
		        	m.setUserId(rs.getString("user_id"));
		        	m.setOrderId(rs.getString("order_id"));

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

	public boolean insert(OrderInformationDomain t) {
		String insert = "insert order_information(order_information_id ,book_id, book_name , book_num,book_price,user_id,order_id,add_time) value(?,?,?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getBookId());
			ps.setString(3, t.getBookName());
			ps.setInt(4, t.getBookNum());
			ps.setInt(5, t.getBookPrice());
			ps.setString(6, t.getUserId());
			ps.setString(7, t.getOrderId());
			
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

	public List<OrderInformationDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM order_information  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<OrderInformationDomain> ms = new ArrayList<OrderInformationDomain>() ; 
			   
		        while(rs.next()){  
		        	OrderInformationDomain m = new OrderInformationDomain() ; 
		        	
		        	m.setBookId(rs.getString("book_id"));
		        	m.setBookName(rs.getString("book_name"));
		        	m.setBookNum(rs.getInt("book_num"));
		        	m.setBookPrice(rs.getInt("book_price"));
		        	m.setOrderInformationId(rs.getString("order_information_id"));
		        	m.setUserId(rs.getString("user_id"));
		        	m.setOrderId(rs.getString("order_id"));
		        	
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
		String delete = "delete from order_information where order_information_id=?";
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

	public boolean update(OrderInformationDomain t) {
		String update = "update order_information set book_name =? where order_information_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getBookName());
			ps.setString(2, t.getOrderInformationId());

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
