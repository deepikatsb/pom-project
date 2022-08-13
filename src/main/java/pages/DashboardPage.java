package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]") WebElement Customer_Menu_Element;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]") WebElement Add_Customer_Menu_Element;
	
	public void validateDashboardPage(String validationText) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), validationText, "Dashboard page is not available");
		
	}
	
	public void clickCustomerMenuElement() {
		Customer_Menu_Element.click();
	}
	public void ClickAddCustomerMenuElement() {
		Add_Customer_Menu_Element.click();
	}
}
