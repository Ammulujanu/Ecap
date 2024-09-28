package selenium_url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sanju");
	  Thread.sleep(2000); 
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sanjuR");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sanju@gmail.com");
	  Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sanju@18");
	  Thread.sleep(2000);
   WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	   Select se=new Select(day);
	 Thread.sleep(2000);
	 se.selectByValue("18");
	/* WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	   Select se1=new Select(month);
	 Thread.sleep(2000);
	 se1.selectByVisibleText("sep");
	 WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	   Select ae=new Select(year);
	 Thread.sleep(2000);
	 ae.selectByValue("2002");*/
	  driver.close();


	}

}
