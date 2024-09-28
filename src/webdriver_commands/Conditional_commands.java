package webdriver_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_commands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   
		Thread.sleep(2000);
        WebElement logoimg= driver.findElement(By.xpath("//img[@alt='company-branding']"));
        System.out.println(logoimg.isDisplayed());// to display
		Thread.sleep(2000);
        WebElement status= driver.findElement(By.xpath("//input[@name='password']"));
        System.out.println(status.isEnabled());//to enable
        Thread.sleep(2000);
        driver.close();
	}
	
}
