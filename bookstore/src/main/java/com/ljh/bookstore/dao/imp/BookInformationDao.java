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
import com.ljh.bookstore.domain.BookInformationDomain;
import com.ljh.bookstore.util.Util;

public class BookInformationDao implements  IBaseDao<BookInformationDomain>{
	
	Util db = new Util();

	public BookInformationDomain selectById(String id) {
		String select = "SELECT * FROM book_information  where book_id=?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setString(1, id);

			   ResultSet rs=ps.executeQuery();
			   BookInformationDomain m = new BookInformationDomain() ; 
		        if(rs.next()){  

		        	m.setBookAuthor(rs.getString("book_author"));
		        	m.setBookCondition(rs.getString("book_condition"));
		        	m.setBookId(rs.getString("book_id"));
		        	m.setBookPages(rs.getString("book_pages"));
		        	m.setBookPicUrl(rs.getString("book_pic_url"));
		        	m.setBookPublish(rs.getString("book_publish"));
		        	m.setBookPrice(rs.getString("book_price"));
		        	m.setBookName(rs.getString("book_name"));	
		        	m.setClassId(rs.getString("class_id"));
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

	public boolean insert(BookInformationDomain t) {
		String insert = "insert book_information(book_id,book_name,book_author,book_price,book_publish,book_pages,book_condition,class_id , book_pic_url , add_time) value(?,?,?,?,?,?,?,?,?,?)";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(insert);
			ps.setString(1, UUID.randomUUID().toString());
			ps.setString(2, t.getBookName());
			ps.setString(3, t.getBookAuthor());
			ps.setString(4, t.getBookPrice());
			ps.setString(5, t.getBookPublish());
			ps.setString(6, t.getBookPages());
			ps.setString(7, t.getBookCondition());
			ps.setString(8, t.getClassId());
			ps.setString(9, t.getBookPicUrl());
			ps.setTimestamp(10, new Timestamp(System.currentTimeMillis()));

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

	public List<BookInformationDomain> selectByPage(int pageNow, int pageSize) {
		String select = "SELECT * FROM book_information  LIMIT ?,?";
		Connection con = db.getCon();
		try {
			
			PreparedStatement ps = con.prepareStatement(select);
			ps.setInt(1, pageNow);
			ps.setInt(2,pageSize);

			   ResultSet rs=ps.executeQuery();
			   
			   List<BookInformationDomain> ms = new ArrayList<BookInformationDomain>() ; 
			   
		        while(rs.next()){  
		        	BookInformationDomain m = new BookInformationDomain() ; 
		        	
		        	m.setBookId(rs.getString("book_id"));
		        	m.setBookAuthor(rs.getString("book_author"));
		        	m.setBookCondition(rs.getString("book_condition"));
		        	m.setBookPages(rs.getString("book_pages"));
		        	m.setBookPicUrl(rs.getString("book_pic_url"));
		        	m.setBookPublish(rs.getString("book_publish"));
		        	m.setBookPrice(rs.getString("book_price"));
		        	m.setBookName(rs.getString("book_name"));	
		        	m.setClassId(rs.getString("class_id"));
		        	
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
		String delete = "delete from book_information where book_id=?";
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

	public boolean update(BookInformationDomain t) {
		String update = "update book_information set book_name =? where book_id =?";
		Connection con = db.getCon();
		try {

			PreparedStatement ps = con.prepareStatement(update);
			ps.setString(2, t.getBookId());
			ps.setString(1, t.getBookName());

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
