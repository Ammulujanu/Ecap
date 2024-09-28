package selenium_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_method {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  //X path using starts-with method
	  driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();
	  //X path using contains method
   driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("anju@gmail.com");
	  //X path using contains test()function
	 driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
	 //X path using and
	   driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("sanju@gmail.com");
	   
	 //X path using or
	   driver.findElement(By.xpath("//input[@name='email' or @id='Email']")).sendKeys("maneesha@gmail.com");
	   
	    
        Thread.sleep(3000);
		driver.close();
	}

}

