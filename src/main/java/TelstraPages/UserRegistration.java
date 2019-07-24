package TelstraPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration extends util{


	
	public UserRegistration(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how = How.CSS,using = "#email_create")
	WebElement txtbx_Email;
	
	@FindBy(how = How.CSS,using = "#SubmitCreate")
	WebElement btn_CreateAccount;
	
	@FindBy(how = How.XPATH,using = "//li[contains(text(),'Invalid email address.')]")
	WebElement element_ErrorMessage;
	
	@FindBy(how = How.CSS,using = "#customer_firstname")
	WebElement txtbx_FName;
	
	@FindBy(how = How.CSS,using = "#customer_lastname")
	WebElement txtbx_LName;
	
	@FindBy(how = How.CSS,using = "#passwd")
	WebElement txtbx_Pwd;
	
	@FindBy(how = How.CSS,using = "#firstname")
	WebElement txtbx_AddrFName;
	
	@FindBy(how = How.CSS,using = "#lastname")
	WebElement txtbx_AddrLName;
	
	@FindBy(how = How.CSS,using = "#address1")
	WebElement txtbx_Addrline1;
	
	@FindBy(how = How.CSS,using = "#city")
	WebElement txtbx_City;
	
	@FindBy(how = How.CSS,using = "#id_state")
	WebElement list_State;
	
	@FindBy(how = How.CSS,using = "#postcode")
	WebElement txtbx_Postcode;
	
	@FindBy(how = How.CSS,using = "#id_country")
	WebElement list_Country;
	
	@FindBy(how = How.CSS,using = "#phone_mobile")
	WebElement txtbx_Mobile;
	
	@FindBy(how = How.CSS,using = "#alias")
	WebElement txtbx_Reference;
	
	@FindBy(how = How.XPATH,using = "//span[contains(text(),'Register')]")
	WebElement btn_Register;
	
	public void enter_Email(String email) {
		txtbx_Email.sendKeys(email);
		 }
		
	public void Click_btnCreateAnAccount() {
		btn_CreateAccount.click();
		 }
	
	public String get_ErrorMessage()
	{
		String strErrorMsg = element_ErrorMessage.getText();
		return strErrorMsg;
	}
		 public void enter_firstName(String firstName) {
			 txtbx_FName.sendKeys(firstName);
		 }
		 
		 public void enter_LastName(String lastName) {
			 txtbx_LName.sendKeys(lastName);
			 }
		 public void enter_pwd(String pwd) {
			 txtbx_Pwd.sendKeys(pwd);
			 }
		  
		 public void enter_addFirstName(String addrfirstName) {
			 txtbx_AddrFName.sendKeys(addrfirstName);
			 }
		 
		 public void enter_addrLastName(String addrlastName) {
			 txtbx_AddrLName.sendKeys(addrlastName);
			 }
		 public void enter_Addrline1(String addresline) {
			 txtbx_Addrline1.sendKeys(addresline);
			 }
		 
		 public void enter_City(String City) {
			 txtbx_City.sendKeys(City);
			 }
		 public void Select_State(String State) {
			 Select sel = new Select(list_State);
			 sel.selectByVisibleText(State);
			 }
		 
		 public void enter_postcode(String Postcode) {
			 txtbx_Postcode.sendKeys(Postcode);
			 }
		 public void Select_Country(String Country) {
			 //txtbx_Country.sendKeys(Country);
			 Select sel = new Select(list_Country);
			 sel.selectByVisibleText(Country);
			 }	 
		 
		 public void enter_mobile(String mobile) {
			 txtbx_Mobile.sendKeys(mobile);
			 }
		 
		 public void enter_reference(String ref) {
			 txtbx_Reference.sendKeys(ref);
			 }
		 
		 public void click_btnRegister()
		 {
			 btn_Register.click();
		 }
		}
