package web_table;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindows {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
	
        driver.get("https://www.letskodeit.com/practice");
        Thread.sleep(3000);
        driver.manage().window().maximize();
      
        String mainWindow = driver.getWindowHandle();
      
        
        driver.findElement(By.id("openwindow")).click();
     
        
        Thread.sleep(3000);

    
        Set<String> allWindows = driver.getWindowHandles();
      
       
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(mainWindow)) {
            
           
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to new window: " + driver.getTitle());
              
               
                driver.close(); 
           
           
                driver.switchTo().window(mainWindow);
               
                System.out.println("Switched back to main window: " + driver.getTitle());
            }
        }

        
        driver.quit(); 
    }

	}


