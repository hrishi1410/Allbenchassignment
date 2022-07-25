<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeForm</title>
</head>
<body>
<form action="/SpringQ5/InsertEmployee.html" method="post">
	 	<table>
	 	<tr>
	 		<td>Employee Id :</td> <td> <input type="text" name="EmployeeId"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Name :</td> <td> <input type="text" name="EmployeeName"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Department  :</td> <td> <input type="text" name="EmployeeDepartment"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Designation :</td> <td> <input type="text" name="EmployeeDesignation"/></td>
	 		</tr>
	 		<tr>
	 		<td>Employee Salary :</td> <td> <input type="text" name="EmployeeSalary"/></td>
	 		</tr>
	 		<tr>
	 		<td> <input type="submit" name="Add"/></td>
	 		</tr>
	 		
	 	</table>
	
	</form>
</body>
</html>