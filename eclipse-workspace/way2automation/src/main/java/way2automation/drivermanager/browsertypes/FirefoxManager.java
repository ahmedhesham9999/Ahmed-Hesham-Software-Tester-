package way2automation.drivermanager.browsertypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import way2automation.drivermanager.IBrowserManager;

public class FirefoxManager implements IBrowserManager {
	@Override
	public WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
