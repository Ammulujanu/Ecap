package webdriver_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_commands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");   //for lauching the url or web page
		Thread.sleep(2000);
        System.out.println(driver.getTitle());               //it return the title of web page
        System.out.println(driver.getCurrentUrl());         //it returns the currentUrl
    //   System.out.println(driver.getPageSource());          //it returns the pageSource code
        System.out.println(driver.getWindowHandle());            //it return the id for single browser  window
        
        driver.close();
	}

}
