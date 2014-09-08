package com.siddhesh.kulkarni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ResetPassword
 */
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetPassword() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password,reenterpass,userid;
		password=request.getParameter("password");
		reenterpass=request.getParameter("reenter");
		HttpSession session=request.getSession();
		LoginUser_Hibernate loginuser=new LoginUser_Hibernate();
		userid=(String) session.getAttribute("user");
		UserLogin user=loginuser.SessionFactoryReturnUser(userid);
		if(password.equals(reenterpass))
		{
			loginuser.SessionFactoryUpdateUserLoginmethod(userid, password);
			response.sendRedirect("Home.jsp");
		}
	}

}
