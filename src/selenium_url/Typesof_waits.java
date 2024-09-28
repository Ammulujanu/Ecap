package selenium_url;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Typesof_waits {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/login");
        Thread.sleep(3000);
        driver.manage().window().maximize();
     // Implicit Wait (global)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(3000);
        // Explicit Wait (specific)
        WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element=explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]")));
        // Click on element
        element.click();
        Thread.sleep(3000);
        // Fluent Wait
        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        Thread.sleep(3000);
        WebElement FluentElement = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("login"));
            }
        });
        Thread.sleep(3000);
        // Click on element
        FluentElement.click();

        // Close driver
        driver.quit();
    }
}



