package way2automation.drivermanager.browsertypes;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import way2automation.drivermanager.IBrowserManager;

public class ChromeManager implements IBrowserManager {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> preferences = new HashMap<>();
		preferences.put("download.prompt_for_download", false);
		preferences.put("download.default_directory", "/Users/user/eclipse-workspace/automationbootcampproject");
		options.setExperimentalOption("prefs", preferences);

		WebDriver driver = new ChromeDriver(options);
		return driver;

	}

}
