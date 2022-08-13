package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement User_name_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement Password_Element;
	@FindBy(how = How.XPATH, using ="/html/body/div/div/div/form/div[3]/button") WebElement Signin_Element;
	
	//Preferrred method
	public void insertUserName(String userName) {
		User_name_Element.sendKeys(userName);
	}
	public void insertPassword(String password) {
		Password_Element.sendKeys(password);
	}
	public void clickSigninButton() {
		Signin_Element.click();
	}
	
	//Another option(When we have only less data)
	public void performLogin(String username,String password) {
		User_name_Element.sendKeys(username);
		Password_Element.sendKeys(password);
		Signin_Element.click();
		
	}
}
