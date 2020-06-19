package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
   //Pagefactory or object repository
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	
	//initializing page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);//this gives the instance of current object
	}
	
	//actions
	public String validateLoginPage() //string since gettitile will be in the form of stringn 
	{
		return driver.getTitle();
		
	}
	
	public HomePage Login(String usm, String pwd)
	{
		username.sendKeys(usm);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}
	
}
