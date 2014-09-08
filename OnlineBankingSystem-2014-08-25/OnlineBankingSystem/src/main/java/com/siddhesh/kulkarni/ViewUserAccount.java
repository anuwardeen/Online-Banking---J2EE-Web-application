package com.siddhesh.kulkarni;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

/**
 * Servlet implementation class ViewAccount
 */
public class ViewUserAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewUserAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("logout")!=null)
		{
			response.sendRedirect("Login.jsp");
		}
		Gson gson=new Gson();
		UserAccount_Hibernate loginuser=new UserAccount_Hibernate();
		HttpSession session=request.getSession();
		String userid=(String)session.getAttribute("user");
		Account account=loginuser.SessionFactoryReturnUser(userid);
		ArrayList<Account> list=new ArrayList<Account>();
		list.add(account);		
		JsonElement jelement=gson.toJsonTree(list,new TypeToken<List<Account>>(){}.getType());
	    JsonArray jarray=jelement.getAsJsonArray();
	    response.setContentType("application/json");
	    response.getWriter().print(jarray);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
