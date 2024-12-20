package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomePage extends UtilityTest {
	
	WebDriver driver;
	
	public LoginHomePage(WebDriver driver)
	{
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id= "user-name")
	WebElement username;
    
	@FindBy(id= "password")
	WebElement password;
	
	@FindBy(id= "login-button")
	WebElement loginButton;
	
	public void LaunchTheApplication()
	{
		
		driver.get("https://www.saucedemo.com/");
	}
	
	public void TakeUsernameAndPasswordToLaunchapplication(String usernamee, String passwordd )
	{
		username.sendKeys(usernamee);
		password.sendKeys(passwordd);
		loginButton.click();
		
	}
	
	
	
}
