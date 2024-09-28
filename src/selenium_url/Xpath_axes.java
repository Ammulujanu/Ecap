package selenium_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_axes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='_6ltg']//child::a")).click();
	 Thread.sleep(2000);
	  driver.close();

	}

}
