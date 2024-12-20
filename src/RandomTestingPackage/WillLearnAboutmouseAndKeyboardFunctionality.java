package RandomTestingPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WillLearnAboutmouseAndKeyboardFunctionality {

	public static void main(String[] args) {
	    String item = "High Tatras 2";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ashish\\\\Documents\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement target = driver.findElement(By.id("trash"));
		
		List<WebElement> draggable = driver.findElements(By.xpath("//ul/li/h5"));
		
		
		
		for(WebElement sorce:draggable)
		   {
			
			if(sorce.getText().equalsIgnoreCase(item))
			{
				Actions action = new Actions(driver);
				action.dragAndDrop(sorce, target).build().perform();
				break;
			}
			
			
					
			}
			
		driver.switchTo().defaultContent();
		
		
	}

}
