package TelstraPages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart extends util{

	
	public ShoppingCart(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	
	//span[@id='layer_cart_product_title']
	@FindBy(how= How.XPATH,using ="//span[@id='layer_cart_product_title']")
	WebElement StrProduct_name;
	
	//
	@FindBy(how= How.XPATH,using ="//div[@id='layer_cart']//div//div//div[2]")
	WebElement StrProduct_Colur;
	
	@FindBy(how= How.CSS,using ="#layer_cart_product_quantity")
	WebElement StrProduct_Quantity;
	
	
	@FindBy(how= How.XPATH,using ="//div/a/img[@title = 'Printed Chiffon Dress']")
	WebElement Product_link;
	
	
	@FindBy(how= How.XPATH,using ="//a[@title='Printed Chiffon Dress']//parent::h5/parent::div//span[text()='Add to cart']")
	WebElement btn_AddtoCart;
	
	@FindBy(how= How.XPATH,using ="//div[@class = 'button-container']//a[@title = 'Proceed to checkout']")
	WebElement Proceed_to_Checkout;
	
	public void product_addtocart(WebDriver driver) throws InterruptedException
	{
		Actions actions = new Actions(driver);

		actions.moveToElement(Product_link).build().perform();
		Thread.sleep(5000);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btn_AddtoCart);	
		js.executeScript("arguments[0].click();", btn_AddtoCart);  
	}
	
	
	public void Product_GetDetails(WebDriver driver)
	{
		String Product_Colur = StrProduct_Colur.getText();
		String st[]= Product_Colur.split(" ");
		
		product_title= st[0]+st[1]+st[2];
		product_color=st[3];
		product_quantity = StrProduct_Quantity.getText();
		
	}
	public void Proceed_to_Checkout(WebDriver driver)
	{
		Proceed_to_Checkout.click();
	}
	
	
	
}
