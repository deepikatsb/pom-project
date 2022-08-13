package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver= driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Add_Contacts_page_Header;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement Full_Name_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement Company_DropDown_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement Email_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement Phone_Number_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement Address_Element;
	

	public void ValidateAddContactPage(String AddContactHeader) {
		Assert.assertEquals(Add_Contacts_page_Header.getText(), AddContactHeader, "Add contacts page not available");
	}
	public void insertFullName(String fullName) {
		Full_Name_Element.sendKeys(fullName+generateRandomNumber(999));
	}
	
	public void selectCompany(String company) {
		selectFromDropDown(Company_DropDown_Element, company);
	}
	
	public void insertEmail(String email) {
		Email_Element.sendKeys(generateRandomNumber(9999)+email);
	}
	public void insertPhoneNumber(String fullName) {
		Full_Name_Element.sendKeys(fullName);
	}
	
	
	
}
