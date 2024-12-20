package PageObjectModelPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductPage extends UtilityTest {
	
		
		WebDriver driver;
		
		public AllProductPage(WebDriver driver)
		{
			super(driver);
			this.driver= driver;
			PageFactory.initElements(driver, this);
			
		}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement ClickAddToCart;
	
	@FindBy(css=".shopping_cart_link")
	WebElement checkItem;
	
	@FindBy(css=".cart_item")
	WebElement AllCartPresentItem;

   By AllProductLoadedest = By.cssSelector("div.inventory_item");
    
    
    public void waitForAllTheProductDiaplayed()
    {
    	
    	waitForElementToVisible(AllProductLoadedest);
    	ClickAddToCart.click();
    	checkItem.click();
    	
    }
    
   
    
    public void VerifyAllSelectedProductDisplayedinAddtoCartSection()
    {
    	
    	waitForElementToVisible(AllCartPresentItem);
    	
    	
    	
    }






	



}