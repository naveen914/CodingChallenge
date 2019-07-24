package TelstraPages;


import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("deprecation")
public class Catalog extends util{
	
	public Catalog(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	@FindBy(how= How.XPATH,using ="//table[@id='cart_summary']//tbody//tr//td[2]")
	WebElement cart_description;
	
	@FindBy(how = How.XPATH,using="//tr[@id='product_7_34_0_0']/td[5]/input[2]")
	WebElement cart_quantity;
	
	public void product_final_description(WebDriver driver)
	{
		String Product_Colur = cart_description.getText();
		String st[]= Product_Colur.split(" ");
		product_title_checkout= st[0]+st[1]+st[2];
		product_color_checkout= st[3];
		product_quantity_checkout = cart_quantity.getText();
	 	Assert.assertEquals(product_title, product_title_checkout);
		Assert.assertEquals(product_color, product_color_checkout);
		Assert.assertEquals(product_quantity,product_quantity_checkout);
		
		
		
	}
	
	
	
}
