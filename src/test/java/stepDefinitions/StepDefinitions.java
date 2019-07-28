package stepDefinitions;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

import TelstraPages.Catalog;
import TelstraPages.LandingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class StepDefinitions {
	WebDriver driver;
	//Driver driver;
	
	LandingPage LandingPageObj;
	UserRegistration userRegObj;

	/*	@Before
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
		*/
		
		
		
		@Given("^User is on Home page$")
		public void user_is_on_Home_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		    //driver =BrowserFactory.startbrowser("chrome");
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    
		}
		
		@When("^User clicked on Signin button and enter incorrect  email address$")
		public void user_clicked_on_Signin_button_and_enter_incorrect_email_address() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			LandingPageObj = new LandingPage(driver);
			
			LandingPageObj.Click_SignIn();
		    
		    Thread.sleep(10000);
			userRegObj = new UserRegistration(driver);
		//	userRegObj.enter_Email(" ");
			userRegObj.Click_btnCreateAnAccount();
			Thread.sleep(10000);
		}
//		
//		@Then("^User should see an error message$")
//		public void user_should_see_an_error_message() throws Throwable {
//		    // Write code here that turns the phrase above into concrete actions
//			String Actualerrormsg;
//			userRegObj = new UserRegistration(driver);
//			Actualerrormsg = userRegObj.get_ErrorMessage();
//			System.out.println(Actualerrormsg);
//			Assert.assertEquals(Actualerrormsg, "Invalid email address.");
//			
//		}
		
		
		@Then("^User should see an error message \"([^\"]*)\"$")
		    public void user_should_see_an_error_message_something(String strExpectedErrorMsg) throws Throwable {
			 	String Actualerrormsg;
				userRegObj = new UserRegistration(driver);
				Actualerrormsg = userRegObj.get_ErrorMessage();
				System.out.println(Actualerrormsg);
				Assert.assertEquals(Actualerrormsg, strExpectedErrorMsg);
				
		    }
		 
		 
		 @When("^User clicked on Signin button and enter correct email address \"([^\"]*)\"$")
		    public void user_clicked_on_signin_button_and_enter_correct_email_address_something(String strEmailId) throws Throwable {
			 	LandingPageObj = new LandingPage(driver);
				
			 	LandingPageObj.Click_SignIn();			    
			    Thread.sleep(10000);
				userRegObj = new UserRegistration(driver);
				userRegObj.enter_Email(strEmailId);
				userRegObj.Click_btnCreateAnAccount();
				Thread.sleep(10000);
		    }
		 
		 
		
		@When("^Enter all following mandatory fields$")
		public void enter_all_the_mandatory_fields(DataTable userdata) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    List<Map<String, String>> list = userdata.asMaps(String.class, String.class);
		   
		    UserRegistration userRegObj = new UserRegistration(driver);
		    
		    userRegObj.enter_firstName(list.get(0).get("cfirstname"));
		    userRegObj.enter_LastName(list.get(0).get("clastname"));
		    userRegObj.enter_pwd(list.get(0).get("password"));
		   // userRegObj.enter_addFirstName(list.get(0).get("fName"));
		    //userRegObj.enter_addrLastName(list.get(0).get("Lname"));
		    userRegObj.enter_Addrline1(list.get(0).get("addr1"));
		    userRegObj.enter_City(list.get(0).get("city"));
		    //Thread.sleep(10000);
		    userRegObj.Select_State(list.get(0).get("state"));
		    Thread.sleep(10000);
		    userRegObj.enter_postcode(list.get(0).get("postcode"));
		    userRegObj.Select_Country(list.get(0).get("country"));
		    userRegObj.enter_mobile(list.get(0).get("mobile"));
		    userRegObj.enter_reference(list.get(0).get("ref"));
		    
		    Thread.sleep(5000);
		    
		    
		    
		}
		
		@When("^click on register button$")
		public void click_on_register_button() throws Throwable {
			UserRegistration userRegObj = new UserRegistration(driver);
			userRegObj.click_btnRegister();
			
		}
		
		@Then("^User should be able to register using a valid email address$")
		public void user_should_be_able_to_register_using_a_valid_email_address() throws Throwable {
			//MystorePage mstObj= new MystorePage(driver);
			String strTitle = driver.getTitle();
			Assert.assertEquals(strTitle, "My account - My store");					
			
		}
		
		@When("^megamenu Dresses>Summer Dresses clicked$")
		public void megamenu_Dresses_Summer_Dresses_clicked() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			MystorePage mstObj= new MystorePage(driver);
			mstObj.navigate_summerDresses(driver);
		}
		
		@Then("^User navigated to Summer dresses page$")
		public void user_navigated_to_Summer_dresses_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			//MystorePage mstObj= new MystorePage(driver);
			String strTitle = driver.getTitle();
			Thread.sleep(10000);
			Assert.assertEquals(strTitle, "Summer Dresses - My Store");					
			
		}
		
		@When("^Select a dress by adding in cart$")
		public void select_a_dress_by_adding_in_cart() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			ShoppingCart scObj = new ShoppingCart(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			scObj.product_addtocart(driver);
			scObj.Product_GetDetails(driver);
			scObj.Proceed_to_Checkout(driver);
			Catalog Catalogobj = new Catalog(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Catalogobj.product_final_description(driver);
			
			
			
			
		}
		
		@Then("^User should see the same product added with name, colour, and quantity in cart page$")
		public void user_should_see_the_same_product_added_with_name_colour_and_quantity_in_cart_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   Catalog ctObj = new Catalog(driver);
			ctObj.product_final_description(driver);
		}


}
