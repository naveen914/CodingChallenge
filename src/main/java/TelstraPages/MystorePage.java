package TelstraPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MystorePage extends util{
	public MystorePage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	@FindBy(how= How.XPATH,using ="//div[@id='block_top_menu']/ul/li[2]/a")
	WebElement link_Dresses;
	
	@FindBy(how= How.XPATH,using ="//li[@class='last']//a[contains(text(),'Summer Dresses')]")
	WebElement link_SummerDresses;
	
	public void navigate_summerDresses(WebDriver driver)
	{
		//Actions actions = new Actions(driver);
		//actions.moveToElement(link_Dresses).perform();
		//actions.moveToElement(link_SummerDresses).perform();
		
		link_Dresses.click();
		link_SummerDresses.click();
	}
}
