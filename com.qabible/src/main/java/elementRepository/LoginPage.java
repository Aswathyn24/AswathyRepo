package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.GeneralUtilities;

public class LoginPage {
	WebDriver driver;
	
	GeneralUtilities utilities=new GeneralUtilities();
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="loginform-username")
	WebElement userName;  // Page Object model having element declaration With Page Factory
	
	@FindBy(id="loginform-password")
	WebElement passWord;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement loginButton;

	// Locate the "Reset it" link
	@FindBy(xpath="//a[text()='reset it']")
	WebElement resetItLink;
	
	// Locate the "Send" button
		@FindBy(xpath = "//button[@class='btn btn-default']")
		WebElement sendButton;

	

	
	public void inputUsername(String name)
	{
		
		userName.sendKeys(name);
		
	}
	public void inputPassword(String passcode)
	{
		
		passWord.sendKeys(passcode);
		
	}
	
	public void clickLogin()
	{
		
		loginButton.click();
	}
	
	// Method to get the text of the "Send" button
		public String getTextOfSendButton() {
			return utilities.getTextOfButton(sendButton);
		}

		public String getFontTypeOfSendButton() {
			return sendButton.getCssValue("font-family");
		}
	
		// Method to click on the "Reset it" link
		
		
		public void clickResetIt()
		{
			resetItLink.click();
		}
		
	public void performLogin(String username, String password)
	{
		inputUsername(username);
		inputPassword(password);
		clickLogin();
		
		
		
	}
	
	
}
