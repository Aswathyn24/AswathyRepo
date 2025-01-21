package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.ConstantClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import utilities.ExcelReadUtility;

public class LoginTestcases extends BaseClass {
	@Test(groups = "Low", dataProvider = "logindataprovider",dataProviderClass = ExcelReadUtility.class)
	public void verifyLoginFeatureIsWorkingWithValidCredentials(String username,String password) {

		LoginPage lp = new LoginPage(driver);
		//lp.inputUsername("carol");
		//lp.inputPassword("1q2w3e4r");
		//lp.clickLogin();
		lp.performLogin(username, password);

		DashboardPage dp = new DashboardPage(driver);
		String actual = dp.getTextOfWelcomeText();
		String expected = "Welcome to Payroll Application";
		Assert.assertEquals(actual, expected, ConstantClass.errorMessageForLoginTestCases);
        System.out.println("");
	}
	
	@Test(groups = "Critical", retryAnalyzer =retrypackage.RetryAnalyzerUtility.class )
	public void verifyTheTextOfSendButton() {// Creating Login Page object and clicks the "Reset It" link
		LoginPage lp = new LoginPage(driver);
		lp.clickResetIt();

		// Creating object for PasswordReset
		LoginPage pr = new LoginPage(driver);
		String actual = pr.getTextOfSendButton();
		String expected = "Send";
		Assert.assertEquals(actual, expected, ConstantClass.errorMessageForLoginTestCases);

	}

// 2.Open the application --> Click "Reset It" hyper link --> Verify the font type of "Send" button text.

	@Test(groups = "Low")

	public void verifyTheFontOfSendButton() {
		LoginPage lp = new LoginPage(driver);
		lp.clickResetIt();

		// Creating object for PasswordReset
		LoginPage pr1 = new LoginPage(driver);
		String actual1 = pr1.getFontTypeOfSendButton();
		String expected1 = "Overpass, sans-serif";
		Assert.assertEquals(actual1, expected1, "Font Type of Send button is not as expected");

	}

}
