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
 * Servlet implementation class ViewTransaction
 */
public class ViewTransaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTransaction() {
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
		HttpSession session=request.getSession();
		String userid=(String)session.getAttribute("user");
		RecordTransaction_Hibernate recordtrah=new RecordTransaction_Hibernate();
		List<RecordTransaction> recordtrans= new ArrayList<RecordTransaction>();
		recordtrans.addAll(recordtrah.SessionFactoryReturnUser(userid));
		//ArrayList<RecordTransaction> list=new ArrayList<RecordTransaction>();
		//list.add(recordtrans);
		JsonElement jelement=gson.toJsonTree(recordtrans,new TypeToken<List<RecordTransaction>>(){}.getType());
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
