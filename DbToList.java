package com.ashwani.connectionjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DbToList {
public static void main(String[] args) {
	List<Employee> list= null;
	Connection con=DbConnection.getConnection();
	try {
		PreparedStatement ps2= con.prepareStatement("select * from data11");
		ResultSet rs1=ps2.executeQuery();
		list=new  ArrayList<Employee>();
		while(rs1.next()) {
			list.add(new Employee(rs1.getInt(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getDouble(5)));
		
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	Collections.sort(list);
	System.out.println(list);
	
}
}
