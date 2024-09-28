package web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_exam {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
        Thread.sleep(2000);
        int rows=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
        System.out.println("size of rows"+" "+rows);
        int columns=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
        System.out.println("size of columns"+" "+columns);
        for(int r=1;r<=197;r++) {
        	for(int c=1;c<=5;c++){
        		String value=driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td["+c+"]")).getText();
        		System.out.println(value);
        	}
        }
       driver.close();
	}

}
