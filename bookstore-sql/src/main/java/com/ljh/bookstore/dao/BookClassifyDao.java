/**
 * BookClassify
 */
/**
 * @author lijiahui
 *
 */
package com.ljh.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ljh.bookstore.domain.BookClassifyDomain;
import com.ljh.bookstore.domain.MenuDomain;
import com.ljh.bookstore.util.Util;

/**
 * menus
 * 
 * @author lijiahui
 *
 */
public class BookClassifyDao implements  IBaseDao<BookClassifyDomain> {
	
	Util db = new Util();

	public BookClassifyDomain selectById(String id) {

		String select = "SELECT * FROM book_classify  where class_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   BookClassifyDomain m = new BookClassifyDomain() ; 
		        if(rs.next()){  
		        	m.setClassId(rs.getString("class_id"));
		        	m.setClassName(rs.getString("class_name"));
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

	public boolean insert(BookClassifyDomain t) {

		String insert = "insert book_classify(class_id , class_name , add_time) value(?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getClassName());
			ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

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

	public List<BookClassifyDomain> selectByPage(int pageNow, int pageSize) {

		String select = "SELECT * FROM book_classify  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<BookClassifyDomain> ms = new ArrayList<BookClassifyDomain>() ; 
			   
		        while(rs.next()){  
		        	BookClassifyDomain m = new BookClassifyDomain() ; 
		        	
		        	m.setClassId(rs.getString("class_id"));
		        	m.setClassName(rs.getString("class_name"));
		        	
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

		String delete = "delete from book_classify where class_id=?";
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

	public boolean update(BookClassifyDomain t) {

		
		String update = "update book_classify set class_name =? where class_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(2, t.getClassId());
			ps.setString(1, t.getClassName());

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
	
	
	
	
//
//	Util db = new Util();
//
//	/* (non-Javadoc)
//	 * @see com.ljh.bookstore.dao.IBookClassifyDao#addBookClassify(java.lang.String)
//	 */
//	public boolean addBookClassify(String className) {// 添加數據
//
//		String insert = "insert book_classify(class_id ,class_name, add_time) value(?,?,?)";
//		Connection con = db.getCon();
//		try {
//
//			PreparedStatement ps = con.prepareStatement(insert);
//			ps.setString(1, UUID.randomUUID().toString());
//			ps.setString(2, className);
//			ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
//
//			int i = ps.executeUpdate();
//			if (i == 1) {
//
//				return true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (con != null) {
//					Util.getClose(con);
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return false;
//	}
//
//	/* (non-Javadoc)
//	 * @see com.ljh.bookstore.dao.IBookClassifyDao#updateBookClassify(java.lang.String, java.lang.String)
//	 */
//	public boolean updateBookClassify(String classID, String className) {// 更新數據
//
//		String update = "update book_classify set class_name =? where class_id =?";
//		Connection con = db.getCon();
//		try {
//
//			PreparedStatement up = con.prepareStatement(update);
//			up.setString(2, classID);
//			up.setString(1, className);
//
//			int b = up.executeUpdate();
//			if (b == 1) {
//
//				return true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (con != null) {
//					Util.getClose(con);
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return false;
//	}
//
//	/* (non-Javadoc)
//	 * @see com.ljh.bookstore.dao.IBookClassifyDao#deleteBookClassify(java.lang.String)
//	 */
//	public boolean deleteBookClassify(String classID) {// 刪除數據
//
//		String delete = "delete from book_classify where class_id=?";
//		Connection con = db.getCon();
//		try {
//
//			PreparedStatement de = con.prepareStatement(delete);
//			de.setString(1, classID);
//
//			int c = de.executeUpdate();
//			if (c == 1) {
//
//				return true;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (con != null) {
//					Util.getClose(con);
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return false;
//
//	}
//
//	/* (non-Javadoc)
//	 * @see com.ljh.bookstore.dao.IBookClassifyDao#selectBookClassify(java.lang.String, java.lang.String)
//	 */
//	public boolean selectBookClassify(String classID,String className) {// 查詢數據
//
//		String select = "select * from book_classify where class_id=? and class_name=?";
//		Connection con = db.getCon();
//		try {
//
//			PreparedStatement se = con.prepareStatement(select);
//			se.setString(1, classID);
//			se.setString(2, className);
//
//			se.executeQuery() ; 
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (con != null) {
//					Util.getClose(con);
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//		return false;
//
//	}

}
