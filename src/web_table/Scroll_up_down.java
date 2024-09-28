package web_table;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
        Thread.sleep(2000);
        //for scroll down
        JavascriptExecutor js= (JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,600)");
      Thread.sleep(2000);
      //for scroll up
      js.executeScript("window.scrollBy(0,-200)");
      Thread.sleep(2000);
      driver.close();
	}

}
