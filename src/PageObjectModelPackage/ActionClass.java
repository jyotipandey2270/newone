package PageObjectModelPackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionClass {
	
}
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");

        // Create WebDriverWait instance
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Check for and close overlay if present
            try {
                WebElement overlay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".overlay-class"))); // Adjust selector as needed
                if (overlay.isDisplayed()) {
                    WebElement closeButton = overlay.findElement(By.cssSelector(".close-button-class")); // Adjust selector as needed
                    closeButton.click();
                    System.out.println("Overlay closed.");
                }
            } catch (TimeoutException e) {
                // Overlay not present, continue with normal flow
                System.out.println("No overlay present.");
            }

            // Wait until the button is clickable and click it
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("newWindowBtn")));
            js.executeScript("arguments[0].scrollIntoView(true);", button);
            button.click();
            System.out.println("Button clicked.");

        } finally {
            // Clean up
            driver.quit();
        }
    }