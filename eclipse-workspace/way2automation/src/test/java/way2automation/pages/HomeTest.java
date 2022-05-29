package way2automation.pages;

import org.testng.annotations.Test;

import way2automation.pages.Home.HomePage;

public class HomeTest extends BaseTest {
	@Test
	public void Home() {
		HomePage home = new HomePage();
		home.launch("https://www.way2automation.com/protractor-angularjs-practice-website.html#");
		home.openBanking();
		home.launchUrl("https://www.way2automation.com/angularjs-protractor/banking/#/manager");
	}

}
