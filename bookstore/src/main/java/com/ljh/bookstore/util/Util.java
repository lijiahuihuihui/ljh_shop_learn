/**
 * 
 */
/**
 * @author skj
 *
 */
package com.ljh.bookstore.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	
	private String url="jdbc:mysql://115.28.233.17:3306/linesno_training_learn_bookstore";
	private String user="learn";
    private String password="learn123$%^";
    private String driver="com.mysql.cj.jdbc.Driver";
    
    public Connection getCon() {
        try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, password);  
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return null ; 
    }
    
    public static void getClose(Connection con) throws SQLException{
        if(con!=null){
            con.close();
        }
    }
   
}