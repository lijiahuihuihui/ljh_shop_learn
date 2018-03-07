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
import com.ljh.bookstore.domain.ShopExplanationDomain;
import com.ljh.bookstore.util.Util;

public class ShopExplanationDao implements  IBaseDao<ShopExplanationDomain>{

	Util db = new Util();
	public ShopExplanationDomain selectById(String id) {
		String select = "SELECT * FROM shop_explanation  where shop_problem_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   ShopExplanationDomain m = new ShopExplanationDomain() ; 
		        if(rs.next()){  
		        	
		        	m.setShopProblemId(rs.getString("shop_problem_id"));
		        	m.setShopProblem(rs.getString("shop_problem"));
		        	m.setShopAnswer(rs.getString("shop_answer"));
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

	public boolean insert(ShopExplanationDomain t) {
		String insert = "insert shop_explanation(shop_problem_id , shop_problem , shop_answer,add_time) value(?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getShopProblem());
			ps.setString(3, t.getShopAnswer());
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

	public List<ShopExplanationDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM shop_explanation  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<ShopExplanationDomain> ms = new ArrayList<ShopExplanationDomain>() ; 
			   
		        while(rs.next()){  
		        	ShopExplanationDomain m = new ShopExplanationDomain() ; 
		        	
		        	m.setShopProblemId(rs.getString("shop_problem_id"));
		        	m.setShopProblem(rs.getString("shop_problem"));
		        	m.setShopAnswer(rs.getString("shop_answer"));
		        	
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
		String delete = "delete from shop_explanation where shop_problem_id=?";
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

	public boolean update(ShopExplanationDomain t) {
		String update = "update shop_explanation set shop_problem =? where shop_problem_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			
			ps.setString(1, t.getShopProblem());
			ps.setString(2, t.getShopProblemId());

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
