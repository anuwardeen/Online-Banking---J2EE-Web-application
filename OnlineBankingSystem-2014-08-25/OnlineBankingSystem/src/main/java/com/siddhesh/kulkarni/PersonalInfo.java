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
 * Servlet implementation class PersonalInfo
 */
public class PersonalInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalInfo() {
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
		LoginUser_Hibernate loginuser=new LoginUser_Hibernate();
		UserInfo_Hibernate userinfo=new UserInfo_Hibernate();
		HttpSession session=request.getSession();
		String userid=(String)session.getAttribute("user");
		UserLogin userlogin=loginuser.SessionFactoryReturnUser(userid);
		UserInfo user=userinfo.SessionFactoryReturnUser(userid);
		ArrayList<CompleteUserInfo> list=new ArrayList<CompleteUserInfo>();
		String username,password,country,address;
		long phone;
		CompleteUserInfo completeinfo=new CompleteUserInfo();
		username=userlogin.getUsername();
		password=userlogin.getPassword();
		address=user.getAddress();
		phone=user.getPhone();
		country=user.getCountry();
		completeinfo.setUserId(userid);
		completeinfo.setUsername(username);
		completeinfo.setPassword(password);
		completeinfo.setAddress(address);
		completeinfo.setCountry(country);
		completeinfo.setPhone(phone);
		list.add(completeinfo);
		JsonElement jelement=gson.toJsonTree(list,new TypeToken<List<CompleteUserInfo>>(){}.getType());
	    JsonArray jarray=jelement.getAsJsonArray();
	    response.setContentType("application/json");
	    response.getWriter().print(jarray);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Gson gson=new Gson();
		LoginUser_Hibernate loginuser=new LoginUser_Hibernate();
		UserInfo_Hibernate userinfo=new UserInfo_Hibernate();
		HttpSession session=request.getSession();
		String userid=(String)session.getAttribute("user");
		UserLogin userlogin=loginuser.SessionFactoryReturnUser(userid);
		UserInfo user=userinfo.SessionFactoryReturnUser(userid);
		ArrayList<CompleteUserInfo> list=new ArrayList<CompleteUserInfo>();
		String username,password,country,address;
		long phone;
		CompleteUserInfo completeinfo=new CompleteUserInfo();
		username=userlogin.getUsername();
		password=userlogin.getPassword();
		address=user.getAddress();
		phone=user.getPhone();
		country=user.getCountry();
		completeinfo.setUserId(userid);
		completeinfo.setUsername(username);
		completeinfo.setPassword(password);
		completeinfo.setAddress(address);
		completeinfo.setCountry(country);
		completeinfo.setPhone(phone);
		list.add(completeinfo);		
		//System.out.println(completeinfo.getAddress()+completeinfo.getCountry()+completeinfo.getPassword()+completeinfo.getPhone()+completeinfo.getUserId()+completeinfo.getUsername());
		JsonElement jelement=gson.toJsonTree(list,new TypeToken<List<CompleteUserInfo>>(){}.getType());
	    JsonArray jarray=jelement.getAsJsonArray();
	    response.setContentType("application/json");
	    response.getWriter().print(jarray);
	}

}
