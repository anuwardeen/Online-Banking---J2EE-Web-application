package com.siddhesh.kulkarni;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Transaction
 */
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
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
		if(request.getParameter("logout")!=null)
		{
			response.sendRedirect("Login.jsp");
		}
		String senderaccno,userid;
		long accountno;
		double amount;
		HttpSession session=request.getSession();
		userid=(String) session.getAttribute("user");
		UserAccount_Hibernate useracc=new UserAccount_Hibernate();
		accountno=Long.parseLong(request.getParameter("receiveraccno").toString());
		amount=Double.parseDouble(request.getParameter("amount").toString());
		Account accountinfosender=useracc.SessionFactoryReturnUser(userid);
		Account accountinforeceiver=useracc.SessionFactoryReturnUser(accountno);		
		PerformTransaction transaction=new PerformTransaction(accountinfosender,accountinforeceiver,amount);
		transaction.transfer();
		if(transaction.isSuccessful())
		{
		RecordTransaction_Hibernate recordtran=new RecordTransaction_Hibernate();
		recordtran.SessionFactoryCreteUserAccountInfomethod(userid,accountinfosender.getAccountno(), accountinforeceiver.getAccountno(), amount);
		}
	}

}
