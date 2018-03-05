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
import com.ljh.bookstore.domain.OrderDomain;
import com.ljh.bookstore.util.Util;

public class OrderDao implements  IBaseDao<OrderDomain> {

	Util db = new Util();
	
	public OrderDomain selectById(String id) {
		String select = "SELECT * FROM ord  where order_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   OrderDomain m = new OrderDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setOrderInformationId("order_information_id");
		        	m.setBookNum(rs.getInt("book_num"));
		        	m.setBookPrice(rs.getInt("book_price"));
		        	m.setBookPriceSum(rs.getInt("book_price_sum"));
		        	m.setOrderCondition(rs.getString("order_condition"));

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

	public boolean insert(OrderDomain t) {
		String insert = "insert ord(order_id,order_information_id , book_num,book_price,book_price_sum,order_condition,add_time) value(?,?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getOrderInformationId());
			ps.setInt(3, t.getBookNum());
			ps.setInt(4, t.getBookPrice());
			ps.setInt(5, t.getBookPriceSum());
			ps.setString(6, t.getOrderCondition());
			
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

	public List<OrderDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM ord  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<OrderDomain> ms = new ArrayList<OrderDomain>() ; 
			   
		        while(rs.next()){  
		        	OrderDomain m = new OrderDomain() ; 
		        	
		        	m.setOrderInformationId("order_information_id");
		        	m.setBookNum(rs.getInt("book_num"));
		        	m.setBookPrice(rs.getInt("book_price"));
		        	m.setBookPriceSum(rs.getInt("book_price_sum"));
		        	m.setOrderCondition(rs.getString("order_condition"));
		        	
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
		String delete = "delete from ord where order_id=?";
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

	public boolean update(OrderDomain t) {
		String update = "update ord set book_num =? where order_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setInt(1, t.getBookNum());
			ps.setString(2, t.getOrderId());

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
