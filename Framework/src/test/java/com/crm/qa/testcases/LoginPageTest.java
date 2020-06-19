package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainCRMPage;

public class LoginPageTest extends TestBase
{
	MainCRMPage maincrm;
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() 
	{
		super();
	}
     @BeforeMethod
     public void setUp()
     {
    	 initialization();
    	 maincrm=new MainCRMPage(); 
    	 loginpage=maincrm.ClickLoginButton();
    	 loginpage=new LoginPage();
     }
     
     @Test(priority=1)
     public void loginpagetitletest()
     {
    	 String title=loginpage.validateLoginPage();
    	 Assert.assertEquals(title, "Cogmento CRM");
     }
     
     @Test(priority=2)
     public void loginpageTest()
     {
    	 homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
     }
     
     @AfterMethod
     public void teardown()
     {
    	 driver.quit();
     }
}
