package codeBingings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.BuySellSidebar;
import pages.LoginPage;
import pages.TradePage;
import cucumber.api.java.en.Then;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

public class SellSteps {

	public static String url = "https://app.plus500.com";

	public static LoginPage loginPage;
	public static TradePage tradePage;
	public static BuySellSidebar buySellSidebar;
	public static WebDriver driver;

	@Before
	public static void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);

		loginPage = new LoginPage(driver);
		tradePage = new TradePage(driver);
		buySellSidebar = new BuySellSidebar(driver);
	}

	@After
	public void closeBrowser() throws InterruptedException {
		deleteSell();
		driver.quit();
	}

	@Given("^I want to login to the system with random account name$")
	public void i_want_to_login_to_the_system_with_random_account_name() throws Throwable {
		loginPage.loginWithRandomAccountName();
	}

	@When("^I select Sell action in the first row or the table$")
	public void iSelectSellActionInTheFirstRowOrTheTable() throws Throwable {
		tradePage.clickSellFirstInRowButton();
	}

	@And("^confirm action$")
	public void selectConfirmAction() throws Throwable {
		buySellSidebar.clickConfirmationButton();
	}

	@Then("^I validate that position \"(.+)\" displayed in the bottom of the row$")
	public void iValidateThatALineWithTheTextPositionSellDisplayedInTheBottomOfTheRow(String position)
			throws Throwable {
		Assert.assertEquals(tradePage.getPositionTextInRow(), "Pozicija: " + position);
	}

	private void deleteSell() throws InterruptedException {
		try {
			Thread.sleep(1000);
			tradePage.clickCloseSellButton();
			buySellSidebar.clickClosePositionButton();
		} catch (NoSuchElementException e) {

		}
	}

	@And("^create new sell$")
	public void createNewSell() throws Throwable {
		tradePage.clickSellFirstInRowButton();
		buySellSidebar.clickConfirmationButton();
	}

	@When("^I select Close action for created sell$")
	public void iSelectCloseActionForCreatedSell() throws Throwable {
		tradePage.clickCloseSellButton();
	}

	@And("^confirm Close action$")
	public void selectCloseAction() throws Throwable {
		buySellSidebar.clickClosePositionButton();
	}

	@Then("^I validate that position \"([^\"]*)\" not displayed in the bottom of the row$")
	public void iValidateThatPositionNotDisplayedInTheBottomOfTheRow(String arg1) throws Throwable {
		Assert.assertTrue(!tradePage.positionTextInRowExists());
	}

	@When("^I select Edit action for created sell$")
	public void iSelectEditActionForCreatedSell() throws Throwable {
		tradePage.clickEditButton();
	}

	@And("^select Close At Profit checkbox$")
	public void selectCloseAtProfitCheckbox() throws Throwable {
		buySellSidebar.clickCloseAtProfitCheckbox();
	}

	@Then("^I validate that checkox is selected$")
	public void iValidateThatCheckoxIsSelected() throws Throwable {
		Assert.assertTrue(buySellSidebar.closeAtProfitCheckboxIsSelected());
	}

	@And("^I validate that Edit sidebar is not visible$")
	public void iValidateThatEditSidebarIsNotVisible() throws Throwable {
		Assert.assertTrue(!buySellSidebar.sidebarIsVisible());
	}

}
