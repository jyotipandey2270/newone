package RandomTestingPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class testingpoo {

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Documents\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,700)");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("newWindowBtn")));
	        button.click();

	     Set<String> windowid=  driver.getWindowHandles();
	     String ParentId = driver.getWindowHandle();
	     for(String chid:windowid)
	     {
	    	if(!chid.equals(ParentId)) 
	    	{
	    		driver.switchTo().window(chid);
	    		driver.manage().window().maximize();
	    		driver.findElement(By.id("firstName")).sendKeys("jyoti");
	    		System.out.println("test");
	    		
	    		driver.close();
	    		//driver.findElement(By.id("lastname")).sendKeys("pandey");
	    		
	    		
	    	}
	    	 
	     }
	    driver.switchTo().window(ParentId) ;
	   System.out.println(driver.findElement(By.className("post-title")).getText());
	   // driver.quit();       
	            
	        
	    }
}