package com.siddhesh.kulkarni.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.siddhesh.kulkarni.Account;

public class AccounTest {

	Account  account= new Account();
	long id=1;
	double bal=100.0;
	
	
	@Before
	public void set()
	{
		
		account.setAccountno(id);
		account.setBalance(bal);
		account.setUserid("sidd");
	}
	
	
	@Test
	public void testgetters()
	{
		assertEquals(id,account.getAccountno());
		assertEquals("sidd",account.getUserid());
	}
	
	
}
