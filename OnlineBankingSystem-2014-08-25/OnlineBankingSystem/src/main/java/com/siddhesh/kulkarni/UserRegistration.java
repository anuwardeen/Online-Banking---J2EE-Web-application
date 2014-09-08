package com.siddhesh.kulkarni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistration
 */
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @throws IOException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid,username,password,reenter,address,country,forgotpassq,forgotpassans;
		long phone,accountno;
		userid=request.getParameter("email");
		username=request.getParameter("username");
		password=request.getParameter("password");
		reenter=request.getParameter("reenter");
		address=request.getParameter("address");
		country=request.getParameter("country");
		phone=Long.parseLong(request.getParameter("phonenumber"));
		accountno=Long.parseLong(request.getParameter("accountno"));
		forgotpassq=request.getParameter("forgotpassselect");
		forgotpassans=request.getParameter("answer");
		System.out.println("------------------------------------------------"+country+userid+username+password+reenter+phone+address);
		if(!(password.equals(reenter))) 
			response.sendRedirect("UserRegistration.jsp");
		LoginUser_Hibernate login=new LoginUser_Hibernate();
		UserInfo_Hibernate loginuserinfo=new UserInfo_Hibernate();	
		UserAccount_Hibernate useracc=new UserAccount_Hibernate();
		UserForgotPassQA_Hibernate userfrgtpass=new UserForgotPassQA_Hibernate();
		login.SessionFactoryCreteUserLoginmethod(userid,password,username);
		loginuserinfo.SessionFactoryCreteUserPersonalInfomethod(userid,address,phone,country);	
		useracc.SessionFactoryCreteUserAccountInfomethod(userid, accountno);
		userfrgtpass.SessionFactoryCreteUserForgtQAmethod(userid, forgotpassq, forgotpassans);
		response.sendRedirect("Login.jsp");
	}

}
