package com.cg.una.service;

import java.util.ArrayList;

import com.cg.una.bean.UniversityBean;
import com.cg.una.dao.UniversityDAO;


public class UniversityService 
{
	public int addapplicatantser(int id,String name,String dob,String hql,int marks,String mail)
	 {
		
		//setId  setName setDob setHighqn setMarks  setEmail
		UniversityBean bean = new UniversityBean();
		UniversityDAO dao=new UniversityDAO();
		bean.setId(id);
		bean.setName(name);
		bean.setDob(dob);
		bean.setHighqn(hql);
		bean.setMarks(marks);
		bean.setEmail(mail);
		 int updateResult = 0;
		 try
		 {
			 updateResult = dao.addApplicatant(bean);
			 return updateResult;
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
	 }
}
