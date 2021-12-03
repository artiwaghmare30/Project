package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy (xpath="//img[@data-testid='user-avatar']")
	private WebElement img;
	
    @FindBy (xpath="//div[text()='Log Out']")
    private WebElement Logoutt;
    
    public Homepage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickonimg()
    {
    	img.click();
    }
	
    public void logout()
    {
    	
    	logout.click();
    }
    
    
    
    
    
}
