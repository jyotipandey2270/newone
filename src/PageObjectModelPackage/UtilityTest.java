package PageObjectModelPackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityTest {
	
	
	WebDriver driver;
	
	public UtilityTest(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

	public void waitForElementToVisible(By locator)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public void waitForElementToVisible(WebElement element)
	{	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	
	
	

}
