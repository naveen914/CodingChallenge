package stepDefinitions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Helpers.BrowserFactory;

public class Driver implements WebDriver {

WebDriver driver;
String browserName;

public Driver(String browserName) {
  this.browserName = browserName;
  if (browserName.equalsIgnoreCase("chrome"))
  {
   this.driver = BrowserFactory.startbrowser("chrome");
   
  }
  if (browserName.equalsIgnoreCase("firefox"))
	  this.driver = BrowserFactory.startbrowser("firefox");

  if (browserName.equalsIgnoreCase("ie"))
	  this.driver = BrowserFactory.startbrowser("ie");


}

public void close() {
	  this.driver.close();

	}

	public WebElement findElement(By arg0) {
	  return this.driver.findElement(arg0);
	}

	public List<WebElement> findElements(By arg0) {
	  return this.driver.findElements(arg0);
	}

	public void get(String arg0) {
	  this.driver.get(arg0);

	}

	public String getCurrentUrl() {
	  return this.driver.getCurrentUrl();
	}

	public String getPageSource() {
	  return this.driver.getPageSource();
	}

	public String getTitle() {
	  return this.driver.getTitle();
	}

	public String getWindowHandle() {
	  return this.driver.getWindowHandle();
	}

	public Set<String> getWindowHandles() {
	  return this.driver.getWindowHandles();
	}

	public Options manage() {
	  return this.driver.manage();
	}

	public Navigation navigate() {
	  return this.driver.navigate();
	}

	public void quit() {
	  this.driver.quit();
	}

	public TargetLocator switchTo() {
	  return this.driver.switchTo();
	}
	
}