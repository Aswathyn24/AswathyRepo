package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ClientsPage {
	WebDriver driver;

	GeneralUtilities utilities = new GeneralUtilities();

	public ClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clientTab;

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody//tr[1]//a[2]")
	WebElement editToolTip;

	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createClientTab;

	@FindBy(xpath = "//input[@id='client-require_po']")
	WebElement checkbox;

	// Method to click on the "Reset it" link

	public void clickClientTab() {
		clientTab.click();
	}

	public String verifyEditToolTip() {
		return editToolTip.getDomAttribute("title");
	}

	public void clickOnCreateClient() {
		createClientTab.click();
		

	}

	public boolean isRequiredProCheckboxSelected() {
		return checkbox.isSelected();
	}

}
