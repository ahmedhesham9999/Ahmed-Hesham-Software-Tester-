package way2automation.pages.Banking;

import org.openqa.selenium.By;

public interface IBankingPage {
	By BANK_MANAGER = By.xpath("//button[@ng-click=\"manager()\"]");
	By BANKMANAGERLOGIN = By
			.xpath("//* [contains(@class, 'btn btn-primary btn-lg') and contains (text(),'Bank Manager Login')]");
	By BANK = By.cssSelector("button[ng-click='manager()']");
	By BANKLOGIN = By.linkText("Bank Manager Login");

	By CUSTOMER = By.xpath("//button[@class='btn btn-primary btn-lg'][1]");
	By ADD_CUSTOMER = By.xpath("//button[@ng-class=\"btnClass1\"]");
	/* By FIRSTNAME_TEXT = By.xpath("//input[@ng-model='fName']"); */
	By FIRSTNAME_TEXT = By.xpath("//input[@placeholder='First Name']");

	By LASTNAME_TEXT = By.xpath("//input[@ng-model=\"lName\"]");
	By POSTALCODE_TEXT = By.xpath("//input[@ng-model=\"postCd\"]");
	By FIRSTNAMEFORM = By.xpath(
			"//tr[@ng-repeat='cust in Customers | orderBy:sortType:sortReverse | filter:searchCustomer'][last()]/td[1]");
	By FORM_TEXT = By.xpath("//input[@placeholder='First Name']");
	By FORM_TEXT1 = By.xpath("//input[@ng-model=\"lName\"]");
	By FORM_TEXT2 = By.xpath("//input[@ng-model=\"postCd\"]");
	By SUBMIT_BUTTON = By.xpath("//button[@type='submit']");
	By CUSTOMERS_TAB = By.xpath("//button[@ng-class='btnClass3']");

	By LAST_ROW_TEXT = By.xpath(
			"//tr[@ng-repeat=\"cust in Customers | orderBy:sortType:sortReverse | filter:searchCustomer\"][last()]");

	By LAST_ROW = By.xpath("//tr[@class='ng-scope'][last()]/td[@class='ng-binding'][1]");

	void launch(String url);

	void openBankManagerLogin();

	void ADD_CUSTOMER();

	void enterFirstName(String firstName);

	void enterLastName(String lastName);

	void enterPostalCode(String postalCode);

	void submit();

	void openCustomersTab();

	String getElements();

	String getLastRow();

}
