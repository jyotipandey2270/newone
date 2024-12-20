package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        LoginHomePage LoginHomePage = new LoginHomePage(driver);
        
        LoginHomePage.LaunchTheApplication();
        LoginHomePage.TakeUsernameAndPasswordToLaunchapplication("standard_user", "secret_sauce");
        
        AllProductPage AllProductPage = new AllProductPage(driver);
        AllProductPage.waitForAllTheProductDiaplayed();
        
        AllProductPage.VerifyAllSelectedProductDisplayedinAddtoCartSection();
        
        
        
        
        
	}

}
