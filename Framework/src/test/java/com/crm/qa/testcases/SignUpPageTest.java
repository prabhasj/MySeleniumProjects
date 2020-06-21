package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.MainCRMPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase
{
   static SignUpPage signup;
   MainCRMPage mainpage;
   SignUpPageTest()
   {
	   super();
   }
   
   @BeforeMethod
   public void setup()
   {
	   initialization();
	   mainpage=new MainCRMPage();
	   mainpage.SignUp();
	   signup=new SignUpPage();
   }
   
   @Test
   public void signuptest()
   {
	   signup.SignUp("prabha3781@gmail.com", "8861970137");
   }
}
