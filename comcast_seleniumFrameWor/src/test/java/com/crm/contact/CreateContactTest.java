package com.crm.contact;

import org.testng.annotations.Test;

public class CreateContactTest {
	
		
		@Test(groups="Regression Suite")
		public void createcontact()
		
		{
			System.out.println("created contact ");
		}
		
		@Test(groups="Smoke")
		public void modifiedcontact()
		
		{
			System.out.println("modified contact ");
		}
		@Test(groups="Smoke")
		public void deletecontact()
		
		{
			System.out.println("deleted contact ");
		}
		@Test(groups="Smoke")
		public void modified()
		
		{
			System.out.println("modified");
		}
	}



