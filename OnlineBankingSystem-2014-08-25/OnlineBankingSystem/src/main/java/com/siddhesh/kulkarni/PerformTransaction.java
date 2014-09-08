package com.siddhesh.kulkarni;

public class PerformTransaction {

  Account accno1,accno2;
  private double amount;
  private boolean value;
  private Object lock=new Object();
  
  PerformTransaction(Account a1,Account a2,double amt)
  {
	 
	  if(a1==null||a2==null)
		  return;
    accno1=a1;
    accno2=a2;
    amount=amt;
    System.out.println(accno1.getAccountno()+"hello"+accno2.getAccountno());
  }  
  
  public void transfer()
  {
	 synchronized(lock){
	  if(checkBalance())
	  {
	  UserAccount_Hibernate user=new UserAccount_Hibernate();
	  user.SessionFactoryUpdateUserAccount(accno1, accno2,amount);
	  value=true;
	  }	 
	  else value=false;
	 }
	 
  }
	public boolean checkBalance()
	{
		if(accno1.getBalance()<=amount)
		return false;
		return true;
	}
	public boolean isSuccessful()
	{
		return value;
	}
}
