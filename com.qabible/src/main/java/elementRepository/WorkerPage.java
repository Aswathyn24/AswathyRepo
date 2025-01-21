package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GeneralUtilities;

public class WorkerPage {
	WebDriver driver;

	GeneralUtilities utilities = new GeneralUtilities();

	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workersTab;

	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorker;

	@FindBy(id = "worker-title")
	WebElement titledropdown;

	public void clickOnWorkersTab() {
		workersTab.click();
	}

	public void clickOnCreateWorker() {
		createWorker.click();
	}

	public String getTitledropdown() {
		Select dropdown = new Select(titledropdown);
		dropdown.selectByIndex(2);
		return dropdown.getFirstSelectedOption().getText();

	}

}
