package TelstraPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public LandingPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	
	@FindBy(how= How.XPATH,using ="//a[@class='login']")
	WebElement link_Signin;
	

	public void Click_SignIn()
	{
		link_Signin.click();
	}
}
