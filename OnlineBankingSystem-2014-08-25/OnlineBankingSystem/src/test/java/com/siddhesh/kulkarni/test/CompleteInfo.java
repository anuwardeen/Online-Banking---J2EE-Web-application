package com.siddhesh.kulkarni.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.siddhesh.kulkarni.CompleteUserInfo;
public class CompleteInfo {

	CompleteUserInfo user=new CompleteUserInfo();
	long phone=12345678;
	
	@Before
	public void set()
	{
		user.setAddress("1116 w taylor");
		user.setCountry("us");
		user.setPassword("password");
		user.setPhone(phone);
		user.setUsername("sidd");
	}
	
	@Test
	public void getTests()
	{
		assertEquals("1116 w taylor",user.getAddress());
		assertEquals("us",user.getCountry());
		assertEquals("password",user.getPassword());
		assertEquals(phone,user.getPhone());
		assertEquals("sidd",user.getUsername());
	}
	
	
}
