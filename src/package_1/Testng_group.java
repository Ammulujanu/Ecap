package package_1;

import org.testng.annotations.Test;

public class Testng_group {

	@Test (groups= {"smoke"})//test case
	public void test1 () {
	System.out.println("test1 method");
	}
	
	@Test   (groups= {"regression"})
	public void test2 () {
	System.out.println("test2 method");
	}
	
	@Test  (groups= {"smoke"})
	public void test3 () {
	System.out.println("test3 method");
	}
	
	@Test  (groups= {"regression"})
	public void test4 () {
	System.out.println("test4 method");
	}
	
	

}
