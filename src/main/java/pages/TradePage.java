package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Waits;

public class TradePage extends AbstractPage {

	public TradePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".short-button > .buySellButton")
	private WebElement sellFirstInRowButton;

	@FindBy(css = ".buy-button > .buySellButton")
	private WebElement buyFirstInRowButton;

	@FindBy(css = ".icon-arrow-down > span")
	private WebElement positionTextInRow;

	@FindBy(css = ".icon-arrow-down > strong > [data-currency]")
	private WebElement valueTextInRow;

	@FindBy(css = ".position-actions > button")
	private WebElement closeButtonInRow;

	@FindBy(css = ".edit-position")
	private WebElement EditLinkInRow;

	@FindBy(id = "sidebar")
	private WebElement sidebar;

	public void clickSellFirstInRowButton() {
		sellFirstInRowButton.click();
		Waits.waitForElement(driver, driver.findElement(By.id("trade-button")));
	}

	public String getPositionTextInRow() {
		Waits.waitForElement(driver, positionTextInRow);
		return positionTextInRow.getText();
	}

	public void clickCloseSellButton() throws InterruptedException {
		Waits.waitForElement(driver, closeButtonInRow);
		closeButtonInRow.click();
	}

	public boolean positionTextInRowExists() {
		try {
			positionTextInRow.isDisplayed();
		} catch (RuntimeException e) {
			return false;
		}
		return true;
	}

	public void clickEditButton() {
		Waits.waitForElement(driver, EditLinkInRow);
		EditLinkInRow.click();
	}

}
