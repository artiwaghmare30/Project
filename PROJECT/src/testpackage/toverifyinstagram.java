package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepack.baseclass3;
import pompackage.Homepage;
import pompackage.Loginpage;

public class toverifyinstagram extends baseclass3 {
	WebDriver driver;
	Loginpage login;
	Homepage log ;
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("launch the browser");
		driver = openfirefoxbrowser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
@BeforeMethod
	public void verifyloginpage()
	{
	
	System.out.println("enter the url and login credintials");
	driver.get("https://www.instagram.com/");
	 login = new Loginpage(driver);
	login.sendusername();
	login.sendpassword();
	login.clickonlogin();
	String url = driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println(url);
	System.out.println(title);
    }
	@Test
	public void verifyhomepage()
	{
		System.out.println("verify the homepage");
		 log = new Homepage(driver);
		log.clickonimg();
		String url1 = driver.getCurrentUrl();
		String title1 = driver.getTitle();
		System.out.println(url1);
		System.out.println(title1);
		
	}
	@AfterMethod
	public void logoutinsta() throws InterruptedException
	{
		System.out.println("logout");
		log.logout();
		Thread.sleep(2000);
	}
	
@AfterClass
	public void afterclass()
	{
		System.out.println("close all tab");
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	

}
