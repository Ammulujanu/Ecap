package selenium_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("anju@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("sanju@18");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        Thread.sleep(3000);
		driver.close();
    }

}

