package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MainCRMPage extends TestBase
{
   //Pagefactory or object repository
   @FindBy(xpath="//span[text()='Log In']")
   WebElement loginbutton;

   
 //initializing page objects
public MainCRMPage()
{
	PageFactory.initElements(driver, this);//this gives the instance of current object
}


//actions
public LoginPage ClickLoginButton()
{
	loginbutton.click();
	return new LoginPage();
}
}
