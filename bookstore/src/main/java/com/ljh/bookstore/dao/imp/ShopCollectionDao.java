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
import com.ljh.bookstore.domain.ShopCollectionDomain;
import com.ljh.bookstore.util.Util;

public class ShopCollectionDao implements  IBaseDao<ShopCollectionDomain>{

	Util db = new Util();
	public ShopCollectionDomain selectById(String id) {
		String select = "SELECT * FROM shop_collection  where collection_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   ShopCollectionDomain m = new ShopCollectionDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setBookId(rs.getString("book_id"));
		        	m.setUserId(rs.getString("user_id"));
		        	m.setCollectionId(rs.getString("collection_id"));
		        	
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

	public boolean insert(ShopCollectionDomain t) {
		String insert = "insert shop_collection(collection_id , user_id , book_id,add_time) value(?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getUserId());
			ps.setString(3, t.getBookId());
			ps.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

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

	public List<ShopCollectionDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM shop_collection  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<ShopCollectionDomain> ms = new ArrayList<ShopCollectionDomain>() ; 
			   
		        while(rs.next()){  
		        	ShopCollectionDomain m = new ShopCollectionDomain() ; 
		        	
		        	m.setBookId(rs.getString("book_id"));
		        	m.setUserId(rs.getString("user_id"));
		        	m.setCollectionId(rs.getString("collection_id"));
		        	
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
		String delete = "delete from shop_collection where collection_id=?";
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

	public boolean update(ShopCollectionDomain t) {
		String update = "update shop_collection set book_id =? where collection_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(2, t.getBookId());
			ps.setString(1, t.getCollectionId());

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
