package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase 
{
   public static WebDriver driver;//this will be global variable
   public static Properties prop;//global bcz properties file is used everywhere to take properties from file
   
   //create constructor of base class and read properties file
   public TestBase()
   {
	   try
	   {
		   prop=new Properties();
		   FileInputStream input=new FileInputStream("C:\\Users\\SCNS390\\eclipse-workspace\\Framework\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		   prop.load(input);
		   
	   }
	   catch(FileNotFoundException e)
	   {
		   e.printStackTrace();
	   }
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
	 }
   public static void initialization() //this is to open browser and initialize driver
   {
	   String browsername=prop.getProperty("browser");//browser is taken from property file.
	   if(browsername.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\SCNS390\\eclipse-workspace\\SeleniumTest\\lib\\chromedriver1\\chromedriver.exe");
	       driver=new ChromeDriver();
	   }
	   else if(browsername.equals("firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver","C:\\Users\\SCNS390\\eclipse-workspace\\SeleniumTest\\lib\\firefoxdriver\\geckodriver.exe");
	       driver=new FirefoxDriver();
	   }
	   else
	   {
		   System.out.println("no browser found");
	   }
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);//here we are taking pageload time from TestUtil class so that we can chnage there directly
	   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);//here also implicit wait is from TestUtil class
	   driver.get(prop.getProperty("url"));//url taken from properties file

   }
}
