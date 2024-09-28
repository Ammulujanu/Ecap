package ecap_framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_1 {
   @BeforeMethod 
   public void launchthebrowser() {
	 System.out.println("Browser is launched");
	}
   @AfterMethod
   public void closebrowser() {
	System.out.println("Browser is Closed");	
   }
     @Test //test case
public void login () {
System.out.println("Logged in");
}
@Test  
public void logout () {
System.out.println("logged out");
}
}
