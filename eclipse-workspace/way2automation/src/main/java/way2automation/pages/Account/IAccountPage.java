package way2automation.pages.Account;

import org.openqa.selenium.By;

public interface IAccountPage {
	By OPENACCOUNT_BUTTON = By.xpath("//button[@class=\"btn btn-lg tab btn-primary\"]");
	By OPENACCOUNT2 = By.xpath("//button[@ng-class='btnClass2']");
	By CUSTOMER_DROPDOWN = By.xpath("//select[@id=\"userSelect\"]");
	By LASTCUSTOMER = By.xpath("//option[@ng-repeat=\"cust in Customers\"][last()]");
	By CURRENCY_DROPDOWN = By.xpath("//select[@id=\"currency\"]");
	By DROPDOWN_VALUES = By.cssSelector("#Skills >option");
	By PROCESS_SUBMITBUTTON = By.xpath("//button[@type=\"submit\"]");
	By CUSTOMER = By.xpath("//button[@ng-class=\"btnClass3\"]");
	By DELETE_BUTTON = By.xpath("//button[@ng-click=\"deleteCust(cust)\"][last()]");

	void openAccount();

	void selectCustomer();

	void selectCurrency();

	void submit();

	void openCustomer();

}
