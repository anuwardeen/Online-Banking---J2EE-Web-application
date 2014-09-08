package com.siddhesh.kulkarni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

/**
 * Servlet implementation class ForgotPassword
 */
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forgotpassq,forgtpassans;
	
		UserForgotPassQA_Hibernate userhibernate=new UserForgotPassQA_Hibernate();		
		forgotpassq=request.getParameter("forgotpassq");
		forgtpassans=request.getParameter("answer");
		UserForgotPassQA userlogin=userhibernate.SessionFactoryReturnUser(forgotpassq,forgtpassans);
		
		if(forgotpassq!=null && forgtpassans!=null)			
			if(userlogin!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("user", userlogin.getUserid());
					response.sendRedirect("ResetPassword.jsp");
			}
		 
	}

}
