package selenium_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_url {

		public static void main(String[]args) throws InterruptedException  {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
		    driver.findElement(By.id("email")).sendKeys("a@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.name("pass")).sendKeys("a@12344");
			Thread.sleep(3000);
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(3000);
			driver.findElement(By.partialLinkText("Create new")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Log in")).click();
			Thread.sleep(3000);
		
			 driver.findElement(By.cssSelector("#inputtext _58mg _5dba _2ph-")).sendKeys("janu");
		     Thread.sleep(3000);

	       	driver.findElement(By.cssSelector("#password_step_input")).sendKeys("janu@12");
			
			Thread.sleep(3000);
            
			driver.close();
			


	}

}

