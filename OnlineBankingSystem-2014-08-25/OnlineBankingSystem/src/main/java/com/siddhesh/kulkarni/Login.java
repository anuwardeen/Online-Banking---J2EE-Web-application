package com.siddhesh.kulkarni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  String userid,password;
	  userid=request.getParameter("userid");
	  password=request.getParameter("password");
	  LoginUser_Hibernate login=new LoginUser_Hibernate();
	  if(login.SessionFactoryCheckUserLogin(userid, password))
	  {
		  HttpSession session=request.getSession();
		  session.setAttribute("user", userid);
		  response.sendRedirect("Home.jsp");		  
	  }
	}

}
