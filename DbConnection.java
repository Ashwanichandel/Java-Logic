package com.ashwani.connectionjdbc;

import java.sql.*;
import java.util.*;

public class DbConnection {
	 private DbConnection () {}
	 private static Connection con=null;
	 static {
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
		 public static Connection getConnection() {
			 return con;
		 }
		 
	 }
	 

