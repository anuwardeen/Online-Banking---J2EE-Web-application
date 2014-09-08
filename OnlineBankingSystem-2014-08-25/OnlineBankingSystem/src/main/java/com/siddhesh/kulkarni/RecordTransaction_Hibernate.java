package com.siddhesh.kulkarni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RecordTransaction_Hibernate {
  //userid accsender accreceiver amt
    
	RecordTransaction record;
	RecordTransaction_Hibernate(){
		record=new RecordTransaction();
	}
	public void SessionFactoryCreteUserAccountInfomethod(String userid,long acc1,long acc2,double amt)
	{
		//record.setId(1);
		record.setUserid(userid);
		record.setAccountsender(acc1);
		record.setAccountreceiver(acc2);
		record.setAmount(amt);
		Session sessionfac=null;
		//try{
		Configuration configurationobj=new Configuration();		
		SessionFactory sessionfactoryobj=configurationobj.configure().buildSessionFactory();
		sessionfac=sessionfactoryobj.openSession();
		sessionfac.beginTransaction();
		sessionfac.save(record);
		sessionfac.getTransaction().commit();
		sessionfac.close();
		//}
		//catch(Exception ex){
		 // session.getTransaction().rollback();	
		//}
	}
	public List<RecordTransaction> SessionFactoryReturnUser(String userid) {
		Session session=null;
		RecordTransaction temp;
		List<RecordTransaction> returnlist=new ArrayList<RecordTransaction>();
		Configuration configuration=new Configuration();		
		SessionFactory sessionfactory=configuration.configure().buildSessionFactory();
		session=sessionfactory.openSession();
		session.beginTransaction();
		List<RecordTransaction> recordlist =session.createQuery("FROM RecordTransaction").list();
		Iterator<RecordTransaction> iterate=recordlist.iterator();
        while(iterate.hasNext())		
        {
        	temp=iterate.next();
        	if(temp.getUserid().equals(userid))
        		returnlist.add(temp);
        }
        session.getTransaction().commit();
		session.close();
		return returnlist;	
	}
}
