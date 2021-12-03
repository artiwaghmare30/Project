package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage {
	private WebDriver driver;
	
	@FindBy (xpath="(//input[@aria-required='true'])[1]")
	private WebElement username;
	
	@FindBy (xpath="//input[@aria-label='Password']")
	private WebElement password;

	@FindBy (xpath="//button[@type='submit']")
	private WebElement login;
public Loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void sendusername()
	{
		username.sendKeys("_bliss_cake_");
		System.out.println(driver.getTitle());
	}
	public void sendpassword()
	{
		password.sendKeys("blisscake");
	}
	public void clickonlogin()
	{
		login.click();
		
}
	


}


