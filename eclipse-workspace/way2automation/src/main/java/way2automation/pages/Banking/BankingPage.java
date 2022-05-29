package way2automation.pages.Banking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Step;
import way2automation.pages.BasePage;

public class BankingPage extends BasePage implements IBankingPage {
	@Step
	@Override
	public void launch(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
	}

	@Override
	public void openBankManagerLogin() {

		// TODO Auto-generated method stub

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 100);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
		 * "button[ng-click='manager()']")));
		 * 
		 * Actions actions = new Actions(driver);
		 * actions.moveToElement(driver.findElement(By.cssSelector(
		 * "button[ng-click='manager()']"))).build().perform(); actions.click();
		 * 
		 * 
		 * Actions actions = new Actions(driver); actions.click(BANK);
		 * 
		 * actions.moveToElement(driver.findElement(BANK)); actions.build().perform();
		 * actions.doubleClick();
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 100); Actions actions = new
		 * Actions(driver);
		 * actions.moveToElement(driver.findElement(By.linkText("Bank Manager Login")));
		 * actions.doubleClick();
		 * 
		 */

	}

	@Override
	public void ADD_CUSTOMER() {
		// TODO Auto-generated method stub
		click(ADD_CUSTOMER);

	}

	@Override
	public void enterFirstName(String firstName) {
		// TODO Auto-generated method stub
		fillText(FIRSTNAME_TEXT, firstName);
	}

	@Override
	public void enterLastName(String lastName) {
		// TODO Auto-generated method stub
		fillText(LASTNAME_TEXT, lastName);
	}

	@Override
	public void enterPostalCode(String postalCode) {
		// TODO Auto-generated method stub
		fillText(POSTALCODE_TEXT, postalCode);

	}

	@Override
	public String getElements() {
		// TODO Auto-generated method stub

		String formText = driver.findElement(FORM_TEXT).getText();
		String formText1 = driver.findElement(FORM_TEXT1).getAttribute("value");
		String formText2 = driver.findElement(FORM_TEXT2).getAttribute("value");
		String Text = formText + formText1 + formText2;
		System.out.println(Text);

		/* String Text = driver.findElement(FIRSTNAMEFORM).getAttribute("value"); */
		return Text;

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub

		click(SUBMIT_BUTTON);

		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();

	}

	@Override
	public void openCustomersTab() {
		// TODO Auto-generated method stub

		click(CUSTOMERS_TAB);
	}

	@Override
	public String getLastRow() {
		// TODO Auto-generated method stub

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(LAST_ROW_TEXT));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		String lastRow = driver.findElement(LAST_ROW_TEXT).getText();

		System.out.println(lastRow);
		return lastRow;
	}

}
