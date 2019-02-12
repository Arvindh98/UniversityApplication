package com.cg.una.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.una.dao.UniversityDAO;
@WebServlet("/login")
public class StatusUpdate extends HttpServlet
{
	public  void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException 
			{
		 if(request.getParameter("submit")!=null)
		 {
		try {
			
		RequestDispatcher rd = null;
		int id=1;int mark=0;
		PrintWriter out=response.getWriter();
		String temp="";
		String name=request.getParameter("language");
		temp=request.getParameter("id");
		id=Integer.parseInt(temp);
		
		UniversityDAO ser = new UniversityDAO();
			
			
			ser.updateStatus(id,name);
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			

			}
			}
}



