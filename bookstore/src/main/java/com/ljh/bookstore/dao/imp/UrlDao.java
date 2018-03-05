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
import com.ljh.bookstore.domain.UrlDomain;
import com.ljh.bookstore.util.Util;

public class UrlDao implements  IBaseDao<UrlDomain>{

	Util db = new Util();
	public UrlDomain selectById(String id) {
		String select = "SELECT * FROM url  where url_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   UrlDomain m = new UrlDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setUrl_id(rs.getString("url_id"));
		        	m.setUrl_name(rs.getString("url_name"));
		        	m.setUrl(rs.getString("url"));
		        	m.setUrl_sort(rs.getInt("url_sort"));

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

	public boolean insert(UrlDomain t) {
		String insert = "insert url(url_id , url_name , url , url_sort , add_time) value(?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getUrl_name());
			ps.setString(3, t.getUrl());
			ps.setDouble(4, t.getUrl_sort());
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

	public List<UrlDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM url  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<UrlDomain> ms = new ArrayList<UrlDomain>() ; 
			   
		        while(rs.next()){  
		        	UrlDomain m = new UrlDomain() ; 
		        	
		        	m.setUrl_id(rs.getString("url_id"));
		        	m.setUrl_name(rs.getString("url_name"));
		        	m.setUrl(rs.getString("url"));
		        	m.setUrl_sort(rs.getInt("url_sort"));
		        	
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
		String delete = "delete from url where url_id=?";
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

	public boolean update(UrlDomain t) {
		String update = "update url set url_name =? where url_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getUrl_name());
			ps.setString(2, t.getUrl_id());

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
