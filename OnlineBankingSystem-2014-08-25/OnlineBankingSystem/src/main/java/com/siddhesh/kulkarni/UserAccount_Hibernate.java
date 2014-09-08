package com.siddhesh.kulkarni;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserAccount_Hibernate {
Account account;

UserAccount_Hibernate()
{
  account=new Account();	
}
public void SessionFactoryCreteUserAccountInfomethod(String userid,long accountno)
{
	account.setAccountno(accountno);
	account.setUserid(userid);
	account.setBalance(100.00);
	Session sessionfac=null;
	//try{
	Configuration configurationobj=new Configuration();		
	SessionFactory sessionfactoryobj=configurationobj.configure().buildSessionFactory();
	sessionfac=sessionfactoryobj.openSession();
	sessionfac.beginTransaction();
	sessionfac.save(account);
	sessionfac.getTransaction().commit();
	sessionfac.close();
	
	//}
	//catch(Exception ex){
	 // session.getTransaction().rollback();	
	//}
}
public Account SessionFactoryReturnUser(String userid) {
	Session session=null;
	Configuration configuration=new Configuration();		
	SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
	session=sessionfactory.openSession();
	session.beginTransaction();
	account=(Account) session.get(Account.class,userid);		
	return account;	
}
public Account SessionFactoryReturnUser(long accountno) {
	Session session=null;
	Configuration configuration=new Configuration();		
	SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
	session=sessionfactory.openSession();
	session.beginTransaction();
	@SuppressWarnings("unchecked")
	Account acc;
	List<Account> account=session.createQuery("from Account").list();
	Iterator iterate=account.iterator();
	while(iterate.hasNext())
	{
		 acc=(Account)iterate.next();
		if(acc.getAccountno()==accountno)
		{
			session.getTransaction().commit();
			session.close();
			return acc;
		}
	}
	session.getTransaction().commit();
	session.close();
	return null;	
}
public void SessionFactoryUpdateUserAccount(Account acc1,Account acc2,double amount)
{
	Session session=null;
	Configuration configuration=new Configuration();		
	SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
	session=sessionfactory.openSession();
	session.beginTransaction();
	Account a1=acc1;
	Account a2=acc2;
	a1.setBalance((a1.getBalance()-amount));
	a2.setBalance((a2.getBalance()+amount));
	session.update(a1);
	session.update(a2);
	session.getTransaction().commit();
	session.close();
	
	//}
	//catch(Exception ex){
	 // session.getTransaction().rollback();	
	//}
}
}
