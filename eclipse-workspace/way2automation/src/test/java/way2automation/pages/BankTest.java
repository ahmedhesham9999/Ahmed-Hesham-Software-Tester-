package way2automation.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import way2automation.pages.Banking.BankingPage;

public class BankTest extends BaseTest {
	@Test
	public void Home() {
		/*
		 * HomePage home = new HomePage(); home.launch(
		 * "https://www.way2automation.com/protractor-angularjs-practice-website.html#")
		 * ;
		 * 
		 * home.openBanking();
		 */
		BankingPage bank = new BankingPage();

		bank.launch("https://www.way2automation.com/angularjs-protractor/banking/#/manager");
		bank.ADD_CUSTOMER();
		bank.enterFirstName("Ahmed");
		bank.enterLastName("LastName");
		bank.enterPostalCode("1288");
		bank.getElements();
		bank.submit();
		bank.openCustomersTab();

		bank.getLastRow();
		String text1 = bank.getElements();
		String text2 = bank.getLastRow();
		Assert.assertEquals(text1, text2);

	}

}
