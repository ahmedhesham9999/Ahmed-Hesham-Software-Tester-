package way2automation.drivermanager.browsertypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import way2automation.drivermanager.IBrowserManager;

public class SafariManager implements IBrowserManager {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		return driver;
	}

}
