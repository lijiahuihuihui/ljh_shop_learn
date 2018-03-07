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
import com.ljh.bookstore.domain.ShopInformationDomain;
import com.ljh.bookstore.util.Util;

public class ShopInformationDao implements  IBaseDao<ShopInformationDomain>{

	Util db = new Util();
	public ShopInformationDomain selectById(String id) {
		String select = "SELECT * FROM shop_information  where information_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   ShopInformationDomain m = new ShopInformationDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setInformationId(rs.getString("information_id"));
		        	m.setBookId(rs.getString("book_id"));
		        	m.setBookName(rs.getString("book_name"));
		        	m.setBookNum(rs.getInt("book_num"));
		        	m.setBookPrice(rs.getInt("book_price"));
		        	m.setBookPriceSum(rs.getInt("book_price_sum"));
		        	m.setAddTime(rs.getString("user_id"));
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

	public boolean insert(ShopInformationDomain t) {
		String insert = "insert shop_information(information_id ,book_id, book_name , book_num,book_price,book_price_sum,user_id,add_time) value(?,?,?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getBookId());
			ps.setString(3, t.getBookName());
			ps.setDouble(4, t.getBookNum());
			ps.setDouble(5, t.getBookPrice());
			ps.setDouble(6, t.getBookPriceSum());
			ps.setString(7, t.getUserId());
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

	public List<ShopInformationDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM shop_information  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<ShopInformationDomain> ms = new ArrayList<ShopInformationDomain>() ; 
			   
		        while(rs.next()){  
		        	ShopInformationDomain m = new ShopInformationDomain() ; 
		        	
		        	m.setInformationId(rs.getString("information_id"));
		        	m.setBookId(rs.getString("book_id"));
		        	m.setBookName(rs.getString("book_name"));
		        	m.setBookNum(rs.getInt("book_num"));
		        	m.setBookPrice(rs.getInt("book_price"));
		        	m.setBookPriceSum(rs.getInt("book_price_sum"));
		        	m.setAddTime(rs.getString("user_id"));
		        	
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
		String delete = "delete from shop_information where information_id=?";
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

	public boolean update(ShopInformationDomain t) {
		String update = "update shop_information set book_name =? where information_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getBookName());
			ps.setString(2, t.getInformationId());

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
