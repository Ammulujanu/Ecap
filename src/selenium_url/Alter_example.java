package selenium_url;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter_example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	/*  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(2000);
	  Alert alr=driver.switchTo().alert();
	  alr.dismiss();   //for ok
	  */
	
	  driver.findElement(By.id("promtButton")).click();
	  Thread.sleep(2000);
	  Alert a=driver.switchTo().alert();
	  a.sendKeys("anju");
	  Thread.sleep(2000);
	  a.accept();  
	  driver.close();
	}

	}


