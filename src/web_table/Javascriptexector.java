package web_table;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexector {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        // Find the hidden element 
        WebElement hiddenElement = driver.findElement(By.id("hide-textbox"));
        Thread.sleep(3000);
       // Create JavaScript Executor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click to hide the text box
        js.executeScript("arguments[0].click();", hiddenElement);
          Thread.sleep(3000);
       
        // Now let's show the element back
        WebElement showElement = driver.findElement(By.id("show-textbox"));
       
        js.executeScript("arguments[0].click();", showElement);
        Thread.sleep(3000);
       // Interact with the text box once it's visible again
        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"displayed-text\"]"));
       
        js.executeScript("arguments[0].value='Selenium Test';", textBox);
        Thread.sleep(3000);
        js.executeScript("arguments[0].value='Selenium Test';",hiddenElement);
        // Close the browser
        driver.quit();
    }
}
    

 
