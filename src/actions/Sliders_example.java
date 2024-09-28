package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders_example {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
            Thread.sleep(2000);
            Actions act=new Actions(driver);
          WebElement slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"+""));
           Thread.sleep(2000);
           System.out.println(slider.getLocation());
           act.dragAndDropBy(slider, 100, 0).perform();
           System.out.println("After operation"+""+slider.getLocation());
/*we can write this step WebElement slider1= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
           or */
           WebElement slid=driver.findElement(By.xpath("//span[2]"));
           Thread.sleep(2000);
           System.out.println(slid.getLocation());
           act.dragAndDropBy(slid, -100, 0).perform();
           System.out.println("After operation"+""+slid.getLocation());
           driver.close(); 
	}

}
