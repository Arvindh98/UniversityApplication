<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w...content-available-to-author-only...3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Success Page</title>
</head>
<%@ page import="com.cg.una.dao.UniversityDAO" import="java.util.HashMap" import="java.util.Iterator" import="com.cg.una.bean.UniversityBean"%>
<body bgcolor="#E6E6FA">>
     
   <center> 
  <h1>Book Info Inserted  Successfully  </h1>
  </center>  

 	<%
 	String abc;
 	UniversityDAO  bc=new UniversityDAO();
 	HashMap<Integer,UniversityBean> hm = new HashMap<Integer,UniversityBean>();
 	hm=bc.getapplicationDetailsById();%>
 	<p>Application_Id Name Student</p>
 	<%for(int i:hm.keySet())
 	{
 		UniversityBean b = hm.get(i);
 	
 	%>
 	<table>
 		<%=b.getId()%>  <%=b.getName()%>  <%=b.getMarks()%>
 		<!--<input type="radio" name="<%=i%>"  >
 		<input type="radio" name="<%=i%>">
 		<br>-->
 		</table>
 		
 	<%}
 	 out.println("<html><title>current bill</title><body>"
     		+ "<h2>welcome </h2>"
     		+ "<form action=\"login\">"
			 +"<input type=\"text\" name=\"id\" value='101'>id"
     		+ "<input type=\"radio\" name=\"language\" value='y'>yes"
     		+"<input type=\"radio\" name=\"language\" value='n'>no"
     		+"<input type=\"submit\" name=\"submit\" value=\"submit\">"
     						+ "</form></body></html>" );
 	
 	%>
 	</body>

</html>