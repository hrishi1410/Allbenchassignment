<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.Q5Controller.EmployeeDAO"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%	EmployeeDAO emp= new EmployeeDAO();
	 ResultSet resultset= emp.getDetailById(request.getAttribute("userId").toString());	
	%>
	<form action="/SpringQ5/updateEmployee.html" method="post">
	 <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>Name</TH>
                <TH>Department</TH>
                <TH>Designation</TH>
                <TH>Salary</TH>
               
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD><input type="text" value="<%= resultset.getInt(1) %>" name="EmployeeId"   /></td>
                <TD><input type="text" value=" <%= resultset.getString(2) %>" name="EmployeeName"/></TD>
                <TD><input type="text" value=" <%= resultset.getString(3) %>" name="EmployeeDepartment"/></TD>
                <TD> <input type="text" value="<%= resultset.getString(4) %>" name="EmployeeDesignation"/></TD>
                <TD> <input type="text" value="<%= resultset.getInt(5) %>" name="EmployeeSalary"/></TD>
                
            </TR>
            <% } %>
            
        </TABLE>
        <p> 
             <input type="submit" value="Update"/>
            </p>
        </form>
</body>
</html>