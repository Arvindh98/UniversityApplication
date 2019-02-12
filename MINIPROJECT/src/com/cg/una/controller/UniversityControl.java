package com.cg.una.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.una.service.UniversityService;
@WebServlet("/application")
public class UniversityControl extends HttpServlet
{

	public  void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException 
			{
				RequestDispatcher rd = null;
				int id=1;int mark=0;
				PrintWriter out=response.getWriter();
				String temp="";
				String name=request.getParameter("name");
				String dob=request.getParameter("dob");
				String hql=request.getParameter("highqn");
				temp=request.getParameter("marks");
				mark=Integer.parseInt(temp);
				String mail=request.getParameter("email");
				
					UniversityService ser = new UniversityService();
					
					
					int updateCount = ser.addapplicatantser(id,name, dob, hql,mark,mail);
					
					System.out.println("inserted "+updateCount+" record   Success");
					
					if (updateCount>1) 
					{
						rd = request.getRequestDispatcher("/adminisatorupdate.html");
						out.print(updateCount);
						
					} else {
						rd = request.getRequestDispatcher("/reject.html");
					}
					rd.forward(request, response);
				}

}
