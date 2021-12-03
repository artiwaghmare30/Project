package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pompackage.Homepage;
import pompackage.Loginpage;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\ARTI\\A Velocity\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Loginpage login = new Loginpage(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	login.sendusername();
	login.sendpassword();
	login.clickonlogin();
	Thread.sleep(3000);
	Homepage log = new Homepage(driver);
	log.clickonimg();
	Thread.sleep(5000);
	log.logout();		

}
}