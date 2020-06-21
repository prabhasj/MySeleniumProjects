package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class SignUpPage extends TestBase
{
	//page factory/object repository
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(xpath="//input[@class='search']")
	WebElement searchDropdown;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement captchaCheckbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement signup;
	
	//initialization of page objects
	public SignUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void SignUp(String eml,String phn)
	{
		email.sendKeys(eml);
		searchDropdown.click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='item active selected']"))).build().perform();
		phone.sendKeys(phn);
		checkbox.click();
		//captchaCheckbox.click();
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		signup.click();
	}
	

}
