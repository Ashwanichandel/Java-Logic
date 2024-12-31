package com.ashwani.connectionjdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.*;

public class DemoCsv {
	public static void main(String[] args) {

		try {
			Connection con = DbConnection.getConnection();
			FileInputStream fis = new FileInputStream("C:\\Users\\Ashwani\\Documents\\ashwani\\Data\\Data1.csv");
			PreparedStatement ps1 = con.prepareStatement("insert into Data11 values(?,?,?,?,?)");
			Scanner sc = new Scanner(fis);
			sc.nextLine();
			while (sc.hasNext()) {
				String[] split = sc.nextLine().split(",");
				ps1.setInt(1, Integer.parseInt(split[0]));
				ps1.setString(2, (split[1]));
				ps1.setString(3, (split[2]));
				ps1.setString(4, (split[3]));
				ps1.setInt(5, Integer.parseInt(split[0]));

				ps1.executeUpdate();

				System.out.println("Sucess!!");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
