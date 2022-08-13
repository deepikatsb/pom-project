package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCustomerPage;
import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	@Test
	public void userShouldBeAbleToCreateCustomer() {
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName("demo@techfios.com");
		loginpage.insertPassword("abc123");
		loginpage.clickSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		dashboardPage.clickCustomerMenuElement();
		dashboardPage.ClickAddCustomerMenuElement();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.ValidateAddContactPage("Contacts");
		addCustomerPage.insertFullName("Seleniumfeb2022");
		addCustomerPage.selectCompany("Amazon");
		addCustomerPage.insertEmail("abcee@techfios.com");
		
	}
	
}
