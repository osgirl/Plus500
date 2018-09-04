package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Randoms;
import utils.Waits;

public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "action")
	private WebElement createNewAccountLink;

	@FindBy(className = "win-contentdialog-primarycommand")
	private WebElement okButtonInPopup;

	@FindBy(id = "newUserEmail")
	private WebElement emailField;

	@FindBy(id = "newUserPassword")
	private WebElement passwordField;

	@FindBy(id = "newUserSubmit")
	private WebElement newUserSubmitButton;

	@FindBy(id = "demoMode")
	private WebElement demoModeButton;

	public void loginWithRandomAccountName() throws InterruptedException {
		Waits.waitForJavascript(driver);
		demoModeButton.click();
		emailField.sendKeys(Randoms.generateEmail());
		passwordField.sendKeys(Randoms.generatePassword());
		newUserSubmitButton.click();
		Waits.waitForElement(driver, okButtonInPopup);

		okButtonInPopup.click();
		Waits.waitForElement(driver, driver.findElement(By.cssSelector(".short-button > .buySellButton")));
	}
}
