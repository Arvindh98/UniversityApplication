package com.cg.una.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import com.cg.una.bean.UniversityBean;

public class UniversityDAO 
{
	public int addApplicatant(UniversityBean bean)
	  {
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  {
			  int bill,m=0;
			  con=CommonCon.getConnection(); 
			  Statement stmt= con.createStatement();
			  ResultSet rs = stmt.executeQuery("SELECT bills.NEXTVAL FROM stu_app");
			  if ( rs!=null && rs.next() ) 
			  {
				 bill = rs.getInt(1);
				 m=bill;
			  }
			  //Given table name is created in database already...  
			  String ins_str = "insert into stu_app values(?,?,?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,m);
			  pstmt.setString(2,bean.getName());
			  pstmt.setString(3,bean.getDob());
			  pstmt.setString(4,bean.getHighqn());
			  pstmt.setInt(5,bean.getMarks());
			  pstmt.setString(6,bean.getEmail());
			  
			  
			  UniversityBean bean1=new UniversityBean();
			  bean1.setId(m);
			  int updateCount = pstmt.executeUpdate();
			  
			  con.close();
			  
			  return m;
			  
			  
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }
		  
	  }
	public HashMap getapplicationDetailsById() throws Exception
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UniversityBean b;
		con = CommonCon.getConnection();
		
		String sel_str ="Select * from stu_app";
		  
		  
		  pstmt = con.prepareStatement(sel_str);
		  rs = pstmt.executeQuery();
		  System.out.println(rs);
		  HashMap<Integer,UniversityBean> hm = new HashMap<Integer,UniversityBean>();
		  while(rs.next())
		  {
			  int id=rs.getInt(1);
			  String name = rs.getString(2);
			  String dob = rs.getString(3);
			  String hiql = rs.getString(4);
			  int mark = rs.getInt(5);
			  String mail = rs.getString(6);
			  
			  b = new UniversityBean(id,name,dob,hiql,mark,mail);
			  hm.put(id, b);
			  System.out.println(hm);
			  
		  }
		 
		 
		  return hm;
		
	}
	public int status(int id) throws Exception
	{
		int result=0;
		try
		{
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			UniversityBean b;
			con = CommonCon.getConnection();
			  pstmt = con.prepareStatement("Select * from results where id="+id);
			  rs = pstmt.executeQuery();
			  System.out.println(rs);
			  String status="";
			  while(rs.next())
			  {
				  status=rs.getString(2);				  
			  }
			  
			  if(status.equals("y"))
			  {
				  result=1;System.out.println("Application is Accepted");
			  }
			  else if(status.equals("n"))
			  {
				  result=2;System.out.println("Application is Rejected");
			  }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		  return result;

	}
	public void updateStatus(int id,String status)
	{
		try
		{
			 	Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				con = CommonCon.getConnection();
			 System.out.println(2);
			 String query="insert into results values(?,?)";
			 pstmt = con.prepareStatement(query);
			 pstmt.setInt(1, id);
			 pstmt.setString(2,status);
			int i=pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			e.printStackTrace();
		}
		
		 }
	}

