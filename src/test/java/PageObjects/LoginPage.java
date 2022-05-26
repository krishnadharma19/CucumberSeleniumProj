package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		PageFactory.initElements(driver, this);
	}

	
	

	

}