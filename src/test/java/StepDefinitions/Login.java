package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PropertiesReader;

public class Login {

	private WebDriver driver = Hooks.driver;

	private WebDriverWait wait;

	public Login() throws Exception {
		PropertiesReader propertiesReader = new PropertiesReader();
		this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
	}

}