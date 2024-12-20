package RandomTestingPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EccomerseTestingSite {

	public static void main(String[] args) throws InterruptedException {
		
		String item=  "Men Printed Round Neck Pure Cotton White T-Shirt";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        WebElement searchBox= driver.findElement(By.xpath("//input[contains(@title, 'Search for Products')]"));
        searchBox.sendKeys("tshirt");
        searchBox.submit();
        List<WebElement>TshirtList = driver.findElements(By.className("WKTcLC"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        for(WebElement DesireTshirt:TshirtList)
        {
        	if(DesireTshirt.getText().contains(item))
        	{
        		DesireTshirt.click();
        		
        		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20000));
        		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class= 'QqFHMw vslbG+ In9uk2']")));
        		js.executeScript("window.scrollBy(0,2000)");
        		driver.findElement(By.className("QqFHMw")).click();
        		break;
        		
        	}
        	
        }
        
        driver.quit();
		

	}
	

}
