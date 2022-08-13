package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public int generateRandomNumber(int boundaryNumber) {
		Random rand = new Random();
		return rand.nextInt(boundaryNumber);
	}
	public void selectFromDropDown(WebElement Element, String visibleText) {
		Select sel = new Select(Element);
		sel.selectByVisibleText(visibleText);
	}
}
