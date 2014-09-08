package com.siddhesh.kulkarni;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserForgotPassQA_Hibernate {

	UserForgotPassQA userforgt;
	UserForgotPassQA_Hibernate()
	{
		userforgt=new UserForgotPassQA();
	}
	@SuppressWarnings("deprecation")
	public void SessionFactoryCreteUserForgtQAmethod(String userid,String question,String answer)
	{
		userforgt.setUserid(userid);
		userforgt.setQuestion(question);
		userforgt.setAnswer(answer);
		Session session=null;
		//try{
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(userforgt);
		session.getTransaction().commit();
		session.close();
		userforgt=null;
		//}
		//catch(Exception ex){
		 // session.getTransaction().rollback();	
		//}
	}
	
	public UserForgotPassQA SessionFactoryReturnUser(String question,String answer)
	{		
		Session session=null;
		UserForgotPassQA userfrgt;
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<UserForgotPassQA> userfrgtpasslist=session.createQuery("from UserForgotPassQA").list();
		Iterator<UserForgotPassQA> iterator=userfrgtpasslist.iterator();
		while(iterator.hasNext())
		{
			userfrgt=(UserForgotPassQA)iterator.next();
			if(question.equals(String.valueOf(userfrgt.getQuestion())) && answer.equals(String.valueOf(userfrgt.getAnswer())))
			{
				session.getTransaction().commit();
				session.close();
			    return userfrgt;	
			}
		}
		session.getTransaction().commit();
		session.close();
		return null;
	}
}
