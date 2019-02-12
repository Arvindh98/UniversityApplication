package com.cg.una.dao;
import java.sql.*;

public class CommonCon 
{
  public static Connection getConnection() throws Exception
  {	
	  String driverName = "oracle.jdbc.driver.OracleDriver";
	  Class.forName(driverName);
	  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","trg628","training628");
	  System.out.println("connected....");
	 // DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl", "trg628", "training628");
	return conn;
  }

}
