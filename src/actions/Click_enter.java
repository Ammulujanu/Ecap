package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_enter {


		    public static void main(String[] args) throws InterruptedException {
		 
		        WebDriver driver = new ChromeDriver();

		        // Open webpage
		        driver.get("https://www.google.com");

		        // Find search box element
		        WebElement searchBox = driver.findElement(By.name("q"));

		        // Enter text and click Enter
		        Actions actions = new Actions(driver);
		        actions.sendKeys(searchBox, "Selenium").sendKeys("\n").perform();

		        // Close driver
		        driver.quit();
		    




	}

}
