package way2automation.pages.Home;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.qameta.allure.Step;
import way2automation.pages.BasePage;

public class HomePage extends BasePage implements IHomePage {
	private static final Logger logger = LogManager.getLogger(HomePage.class);

	@Override
	@Step
	public void launch(String url) {

		goToUrl(url);
	}

	@Override
	public void openBanking() {
		// TODO Auto-generated method stub
		click(BANKING);
	}

	@Override
	public void launchUrl(String url2) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get(url2);
	}

}
