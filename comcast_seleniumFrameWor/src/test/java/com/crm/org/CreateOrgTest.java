package com.crm.org;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test(groups="Smoke")
	public void createorganization()
	
	{
		System.out.println("created organization ");
	}
	
	@Test(groups="regression")
	public void modifiedorganization()
	
	{
		System.out.println("modified organization ");
	}
	@Test(groups="regression")
	public void deleteorganization()
	
	{
		System.out.println("deleted organization ");
	}
    
	@Test(groups="regression")
	public void changesdone()
	
	{
		System.out.println("changes done");
	}

}
