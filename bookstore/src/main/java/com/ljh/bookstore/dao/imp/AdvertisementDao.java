/**
 * Advertisement
 */
/**
 * @author lijiahui
 *
 */

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
import com.ljh.bookstore.domain.AdvertisementDomain;
import com.ljh.bookstore.util.Util;

public class AdvertisementDao implements  IBaseDao<AdvertisementDomain> {

	Util db = new Util();
	
	public AdvertisementDomain selectById(String id) {


		String select = "SELECT * FROM advertisement  where adv_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   AdvertisementDomain m = new AdvertisementDomain() ; 
		        if(rs.next()){  
		        	m.setAdvId(rs.getString("adv_id"));
		        	m.setAdvName(rs.getString("adv_name"));
		        	m.setAdvPicUrl(rs.getString("adv_pic_url"));
		        	
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

	public boolean insert(AdvertisementDomain t) {


		String insert = "insert advertisement(adv_id , adv_name , adv_pic_url , add_time) value(?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getAdvName());
			ps.setString(3,t.getAdvPicUrl());
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

	public List<AdvertisementDomain> selectByPage(int pageNow, int pageSize) {


		String select = "SELECT * FROM advertisement  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<AdvertisementDomain> ms = new ArrayList<AdvertisementDomain>() ; 
			   
		        while(rs.next()){  
		        	AdvertisementDomain m = new AdvertisementDomain() ; 
		        	
		        	m.setAdvId(rs.getString("adv_id"));
		        	m.setAdvName(rs.getString("adv_name"));
		        	m.setAdvPicUrl(rs.getString("adv_pic_url"));
		        	
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


		String delete = "delete from advertisement where adv_id=?";
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

	public boolean update(AdvertisementDomain t) {


		String update = "update advertisement set adv_name =? where adv_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(2, t.getAdvId());
			ps.setString(1, t.getAdvName());

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
