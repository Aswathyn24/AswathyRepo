package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DashboardPage {
	WebDriver driver;

	GeneralUtilities utilities = new GeneralUtilities();

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Welcome to Payroll Application']")
	WebElement welcomeText;

	@FindBy(xpath = "//a[@class='dropdown-toggle']\")")
	WebElement profiledropdown;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutButton;

	public String getTextOfWelcomeText() {
		return utilities.getTextOfButton(welcomeText);

	}

}
