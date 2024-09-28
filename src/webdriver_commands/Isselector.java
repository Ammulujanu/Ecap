package webdriver_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fregisterresult%2F1");   
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        WebElement radiobutton=driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(radiobutton.isSelected());
		Thread.sleep(2000);
		driver.close();

	}

}
