package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainCRMPage;

public class MainCRMPageTest extends TestBase
{
	MainCRMPage maincrm;
	LoginPage loginpage;
	public MainCRMPageTest()
	{
		super();
	}
	
	@BeforeMethod
    public void setUp()
    {
   	 initialization();
   	 maincrm=new MainCRMPage();
    }
	
	@Test
	public void ValidateMainLoginButton()
	{
		loginpage=maincrm.ClickLoginButton();
	}


    @AfterMethod
    public void teardown()
    {
   	 driver.quit();
    }
}
