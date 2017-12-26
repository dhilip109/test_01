package com.practice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class EmpDao {
	public static int saveEmp(Emp e){
		int status=0;
		try{
			Class.forName("com.mysql.jdbc.com");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Dhilip","root","root");
			PreparedStatement ps=con.prepareStatement("insert into emp(name,email,password,city)values(?,?,?,?)");
			ps.setString(1,e.username);
			ps.setString(2, e.email);
			ps.setString(3,e.password);
			ps.setString(4, e.city);
		 status=	ps.executeUpdate();
	
		}
		catch(Exception e1){
			System.out.println(e);
		}
		return status;
		
		
	}

}
