package com.cg.una.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.una.dao.UniversityDAO;
import com.cg.una.service.UniversityService;
@WebServlet("/status")
public class ApplicationStatus extends HttpServlet
{
		public  void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException 
				{
			try
			{
					RequestDispatcher rd = null;
					int id=0;
					PrintWriter out=response.getWriter();
					String temp="";
					temp=request.getParameter("id");
					id=Integer.parseInt(temp);
					System.out.println(id);
					UniversityDAO da=new UniversityDAO();
					int updateCount=da.status(id);
						if (updateCount==1) 
						{
							rd = request.getRequestDispatcher("/Applicationaccept.html");
							
						} else if (updateCount==2) {
							rd = request.getRequestDispatcher("/reject.html");
						}
						rd.forward(request, response);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
					}

	}



