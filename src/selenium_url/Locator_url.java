package selenium_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_url {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);

		//driver.findElement(By.partialLinkText("Create new")).click();
	     driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("janu");
	     Thread.sleep(3000);

       	driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("janu@12");
		
		Thread.sleep(3000);
		driver.close();


	}

}
