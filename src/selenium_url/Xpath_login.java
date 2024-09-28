package selenium_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hrm.medgre.com/web/index.php/auth/login");
		 Thread.sleep(2000);
		 //X path using contains method
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("anju@gmail.com");
        Thread.sleep(2000);
		 //X path using starts-with method
	    driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("sanju@18");
	    Thread.sleep(2000);
		   //X path using contains method
	    driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]")).click();
	    Thread.sleep(2000);
	    driver.close();
	  }

}

