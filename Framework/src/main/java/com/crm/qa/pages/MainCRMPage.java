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
   
   @FindBy(xpath="//a[@href='https://register.freecrm.com/register/' and @class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
   WebElement signupButton;

   
 //initializing page objects
public MainCRMPage()
{
	PageFactory.initElements(driver, this);//this gives the instance of current object
}


//actions
public SignUpPage SignUp()
{
	signupButton.click();
	return new SignUpPage();
}

public LoginPage ClickLoginButton()
{
	loginbutton.click();
	return new LoginPage();
}
}
