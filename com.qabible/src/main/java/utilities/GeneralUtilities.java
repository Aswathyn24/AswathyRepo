package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	
	

	public String getToolTipValue(WebElement value) {
		return value.getDomAttribute("title");

	}

	public String getDropdownSelectedValue(WebElement element, String valueToSelect) {
		Select select = new Select(element);
		select.selectByVisibleText(valueToSelect);
		WebElement selectedValue = select.getFirstSelectedOption();
		String text = selectedValue.getText();
		return text;

	}

	public String getTextOfButton(WebElement element) {
		return element.getText();
	}

	public void scrollThePage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");
	}
	
	
	
	

}

//BaseClass --> TestCases--> ElementRepository-->general utilities
