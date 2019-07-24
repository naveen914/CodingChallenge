package Helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startbrowser(String browsername)
	{
		
		if (browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if  (browsername.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().fullscreen();
		driver.get("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);;
		return driver;
	}
}
