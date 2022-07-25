package com.Q5Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	private Connection con;
	
	public  EmployeeDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	   	    this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/SpringQ4?createDatabaseIfNotExist=true&useUnicode=true", "root", "Pande@930951");
			}catch (Exception e) {
				// TODO: handle exception
			}
	}
	
	public void insertUser(Employee employee) throws Exception {
		int employeeId=employee.getEmployeeId(); 
		String employeeName=employee.getEmployeeName();
		
		 String employeeDepartment=employee.getEmployeeDepartment();
		 String employeeDesignation=employee.getEmployeeDesignation();
		 int employeeSalary=employee.getEmployeeSalary();
		 
		 PreparedStatement preparedStatement = con.prepareStatement("insert into employee (Employee_Id,Employee_Name,Employee_Department,Employee_Designation,Employee_Salary) values(?,?,?,?,?)");
		// preparedStatement.setInt(1, 1);
		 preparedStatement.setInt(1, employeeId);
    	 preparedStatement.setString(2, employeeName);
    	 preparedStatement.setString(3,employeeDepartment);
    	 preparedStatement.setString(4, employeeDesignation);
    	 preparedStatement.setInt(5,employeeSalary);
    	 preparedStatement.executeUpdate();
		
	}
	
	public ResultSet getDetails() throws Exception{
		PreparedStatement preparedStatement= con.prepareStatement("select * from employee");
		ResultSet resultSet=preparedStatement.executeQuery();
		return resultSet;
	}

	public void deleteEmployee(int id)throws Exception{
		
		PreparedStatement preparedStatement = con.prepareStatement("DELETE from employee where Employee_Id=?");
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
	}
	
	public ResultSet getDetailById(String id) throws Exception {
		PreparedStatement preparedStatement= con.prepareStatement("select * from employee where Employee_Id=?");
		//Integer i = Integer.parseInt(id);
		
		preparedStatement.setString(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		return resultSet;
	}
	
	public void updateDetails(Employee employee) throws Exception {
		String sql = "UPDATE employee SET Employee_Name=?,Employee_Department=?,Employee_Designation=?,Employee_Salary=? where Employee_Id=?";
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, employee.getEmployeeName());
		preparedStatement.setString(2, employee.getEmployeeDepartment());
		preparedStatement.setString(3, employee.getEmployeeDesignation());
		preparedStatement.setInt(4, employee.getEmployeeSalary());
		preparedStatement.setInt(5, employee.getEmployeeId());
		
		preparedStatement.executeUpdate();
	}
}
