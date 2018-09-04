package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waits;

public class BuySellSidebar extends AbstractPage {

	public BuySellSidebar(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "amount-input")
	private WebElement amountField;

	@FindBy(id = "trade-button")
	private WebElement confirmationButton;

	@FindBy(id = "closePositionBtn")
	private WebElement closePositionButton;

	@FindBy(id = "close-at-profit-checkbox")
	private WebElement closeAtProfitCheckbox;

	public void clickConfirmationButton() {
		Waits.waitForElement(driver, confirmationButton);
		confirmationButton.click();
	}

	public void clickClosePositionButton() {
		Waits.waitForElement(driver, closePositionButton);
		closePositionButton.click();
		Waits.waitForJavascript(driver);
	}

	public void clickCloseAtProfitCheckbox() {
		closeAtProfitCheckbox.click();
	}

	public boolean closeAtProfitCheckboxIsSelected() {
		return closeAtProfitCheckbox.isSelected();
	}

	public boolean sidebarIsVisible() {
		try {
			confirmationButton.isDisplayed();
		} catch (RuntimeException e) {
			return false;
		}
		return true;
	}

}
