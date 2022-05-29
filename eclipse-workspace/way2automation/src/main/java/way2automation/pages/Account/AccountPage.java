package way2automation.pages.Account;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import way2automation.pages.BasePage;

public class AccountPage extends BasePage implements IAccountPage {

	@Override
	public void openAccount() {

		// TODO Auto-generated method stub
		// WebDriverWait wait = new WebDriverWait(driver, 100);
		// click(OPENACCOUNT_BUTTON);
		clickAction(OPENACCOUNT2);

	}

	@Override
	public void selectCustomer() {
		// TODO Auto-generated method stub
		selectFromDropdown1(CUSTOMER_DROPDOWN);
	}

	@Override
	public void selectCurrency() {
		// TODO Auto-generated method stub

		WebElement drpDwnList = driver.findElement(CURRENCY_DROPDOWN);

		Select objSel = new Select(drpDwnList);
		List<WebElement> weblist = objSel.getOptions();

		int iCnt = weblist.size();
		Random num = new Random();
		int iSelect = num.nextInt(iCnt);

		objSel.selectByIndex(iSelect);

	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		click(PROCESS_SUBMITBUTTON);
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
	}

	@Override
	public void openCustomer() {
		// TODO Auto-generated method stub
		click(CUSTOMER);
	}

}
