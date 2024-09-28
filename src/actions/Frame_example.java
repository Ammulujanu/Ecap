package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		//frame1
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();         //go back to page
		Thread.sleep(2000);
		System.out.println("frame"+""+frame);
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hi Sanju");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();         //go back to page
		Thread.sleep(2000);
		System.out.println("frame2"+""+frame2);
		driver.close();
		}

}

