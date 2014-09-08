package com.siddhesh.kulkarni;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginUser_Hibernate {

	UserLogin user;
	
	LoginUser_Hibernate()
	{
		user=new UserLogin(); // 1 table will store userid,username and password
		
	}
	
	
	@SuppressWarnings("deprecation")
	public void SessionFactoryCreteUserLoginmethod(String userid,String password,String username)
	{
		user.setUserId(userid);
		user.setUsername(username);
		user.setPassword(password);
		Session session=null;
		//try{
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		user=null;
		//}
		//catch(Exception ex){
		 // session.getTransaction().rollback();	
		//}
	}
	public void SessionFactoryUpdateUserLoginmethod(String userid,String password)
	{
		Session session=null;
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		UserLogin temp=(UserLogin) session.get(UserLogin.class, userid);		
		temp.setPassword(password);		
		session.update(temp);
		session.getTransaction().commit();
		session.close();
		user=null;
		//}
		//catch(Exception ex){
		 // session.getTransaction().rollback();	
		//}
	}
	public boolean SessionFactoryCheckUserLogin(String username,String password)
	{
		
		if(username ==null || password==null)
			return false;
		if(username.length()==0||password.length()==0)
			return false;
		Session session=null;
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		user=(UserLogin) session.get(UserLogin.class,username);
		if(user.getPassword().equals(password))
		{
			user=null;
			return true;
		}
		user=null;
		return false;
	}
	public UserLogin SessionFactoryReturnUser(String userid)
	{		
		Session session=null;
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		user=(UserLogin) session.get(UserLogin.class,userid);		
		return user;
	}
	
	
}
