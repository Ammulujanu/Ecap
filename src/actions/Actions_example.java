package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        WebElement books= driver.findElement(By.linkText("BOOKS"));
        Actions a=new Actions(driver);
        a.moveToElement(books).build().perform();
        Thread.sleep(2000);

   
        driver.close();
      }

}
