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
import com.ljh.bookstore.domain.StoreInformationDomain;
import com.ljh.bookstore.util.Util;

public class StoreInformationDao implements  IBaseDao<StoreInformationDomain>{

	Util db = new Util();
	
	public StoreInformationDomain selectById(String id) {
		String select = "SELECT * FROM store_information  where store_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   StoreInformationDomain m = new StoreInformationDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setStoreId(rs.getString("store_id"));
		        	m.setStoreName(rs.getString("store_name"));
		        	m.setStoreAddress(rs.getString("store_address"));
		        	m.setStoreIntroduce(rs.getString("store_introduce"));
		        	m.setStoreTelephone(rs.getString("store_telephone"));
		        	
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

	public boolean insert(StoreInformationDomain t) {
		String insert = "insert store_information(store_id , store_name , store_address, store_introduce, store_telephone, add_time) value(?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getStoreName());
			ps.setString(3, t.getStoreAddress());
			ps.setString(4, t.getStoreIntroduce());
			ps.setString(5, t.getStoreTelephone());
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

	public List<StoreInformationDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM store_information  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<StoreInformationDomain> ms = new ArrayList<StoreInformationDomain>() ; 
			   
		        while(rs.next()){  
		        	StoreInformationDomain m = new StoreInformationDomain() ; 
		        	
		        	m.setStoreId(rs.getString("store_id"));
		        	m.setStoreName(rs.getString("store_name"));
		        	m.setStoreAddress(rs.getString("store_address"));
		        	m.setStoreIntroduce(rs.getString("store_introduce"));
		        	m.setStoreTelephone(rs.getString("store_telephone"));
		        	
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
		String delete = "delete from store_information where store_id=?";
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

	public boolean update(StoreInformationDomain t) {
		String update = "update store_information set store_name =? where store_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getStoreName());
			ps.setString(2, t.getStoreId());

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
