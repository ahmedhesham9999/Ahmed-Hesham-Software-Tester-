package way2automation.pages.Home;

import org.openqa.selenium.By;

public interface IHomePage {
	By BANKING = By.xpath("//img[@alt=\"banking\"]");

	void launch(String url);

	void launchUrl(String url2);

	void openBanking();

}
