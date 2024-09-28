package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_exm {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("Hi frds");
      
        Actions keyact=new Actions(driver);
        //selecting entire text CTRL A
        keyact.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        //Copy entire text CTRL C
        keyact.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        //TAB>>shift to 2 tab
        keyact.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        Thread.sleep(2000);
      //Past the entire text CTRL V
        keyact.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL);
        
        
      
    

	}

}
