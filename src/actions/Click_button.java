package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
        Thread.sleep(2000);
      WebElement doubleClickBtn= driver.findElement(By.id("doubleClickBtn"));
      WebElement rightClickBtn= driver.findElement(By.id("rightClickBtn"));
      Actions act=new Actions(driver);
      act.doubleClick(doubleClickBtn ).perform(); //double
      Thread.sleep(2000);
      act.contextClick(rightClickBtn).perform();//right 
      Thread.sleep(2000);
      driver.close();

	}

}
