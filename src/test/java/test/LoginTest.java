package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		//LoginPage loginpage = new LoginPage();// cant do
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName("demo@techfios.com");
		loginpage.insertPassword("abc123");
		loginpage.clickSigninButton();
		
		BrowserFactory.teardown();
	}
}
