package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class testbase {

	
	Driver driver;
	
	@Before
	public void setUp() {
		  String browserName = getParameter("browser");
		  driver = new Driver(browserName); 
		 }
	
	@After
	public void teardown()
	{
		System.out.println("finishing the scenario");
		driver.quit();
	}
	
	private String getParameter(String name) { 
		  String value = System.getProperty(name);
		  if (value == null)
		     throw new RuntimeException(name + " is not a parameter!");

		  if (value.isEmpty())
		    throw new RuntimeException(name + " is empty!");

		  return value;
		 }   
	
}
