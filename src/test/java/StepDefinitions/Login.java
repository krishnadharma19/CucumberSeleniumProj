package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PropertiesReader;

import java.time.Duration;

public class Login {

	private WebDriver driver = Hooks.driver;

	private WebDriverWait wait;

	public Login() throws Exception {
		PropertiesReader propertiesReader = new PropertiesReader();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(propertiesReader.getTimeout()));
	}

}