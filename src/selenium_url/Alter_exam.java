package selenium_url;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alter_exam {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.name("proceed")).click();
	  Thread.sleep(2000);
	  Alert al=driver.switchTo().alert();
	  al.accept();   //for ok
	  Thread.sleep(2000);
	  driver.close();
	}

}