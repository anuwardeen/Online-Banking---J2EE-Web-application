package com.siddhesh.kulkarni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserInfo_Hibernate {
	UserInfo userinfo;
	UserInfo_Hibernate()
	{
		userinfo=new UserInfo(); // 2nd will store user personal info
		
		
	}
	public void SessionFactoryCreteUserPersonalInfomethod(String userid,String address,long phone,String country)
	{
		userinfo.setUserId(userid);
		userinfo.setAddress(address);
		userinfo.setCountry(country);
		userinfo.setPhone(phone);
		Session sessionfac=null;
		//try{
		Configuration configurationobj=new Configuration();		
		SessionFactory sessionfactoryobj=configurationobj.configure().buildSessionFactory();
		sessionfac=sessionfactoryobj.openSession();
		sessionfac.beginTransaction();
		sessionfac.save(userinfo);
		sessionfac.getTransaction().commit();
		sessionfac.close();
		//}
		//catch(Exception ex){
		 // session.getTransaction().rollback();	
		//}
	}
	public UserInfo SessionFactoryReturnUser(String userid)
	{		
		Session session=null;
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		userinfo=(UserInfo) session.get(UserInfo.class,userid);		
		return userinfo;
	}
}
