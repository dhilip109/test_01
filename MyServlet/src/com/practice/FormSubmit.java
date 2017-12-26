package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSubmit
 */
@WebServlet("/FormSubmit")
public class FormSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init get called");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		String email=request.getParameter("email");
		String password=request.getParameter("pwd");
		String city=request.getParameter("cty");
		Emp e= new Emp();
		e.setUsername(name);
		e.setEmail(email);
		e.setPassword(password);
		e.setCity(city);
	int status=	EmpDao.saveEmp(e);
	if(status!=0){
		System.out.println("record inserted successfully");
	}
		
	}

}
