package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import base.BaseClass;
import constant.ConstantClass;
import elementRepository.LoginPage;
import elementRepository.WorkerPage;
import utilities.ExcelReadUtility;

public class WorkersTabTestcases extends BaseClass {
	// 4.Open the application --> Login to the application --> Navigate to "Worker"
	// menu --> Click "Create Worker" sub menu --> Select any value from the "Title"
	// drop-down and verify the selected value.
	@Test(groups = "Critical", dataProvider = "logindataprovider",dataProviderClass = ExcelReadUtility.class)
	public void verifyAnySelectedValueFromTitleDropdown(String username,String password) {
		LoginPage lp = new LoginPage(driver);
//		lp.inputUsername("carol");
//		lp.inputPassword("1q2w3e4r");
//		lp.clickLogin();
		lp.performLogin(username, password);

		WorkerPage wp = new WorkerPage(driver);
		wp.clickOnWorkersTab();
		wp.clickOnCreateWorker();

		String actualTitle = wp.getTitledropdown();
		String expectedTitle = "Ms";
		Assert.assertEquals(actualTitle, expectedTitle, ConstantClass.errorMessageForWorkersTestCases);
		System.out.println("Testcase 4 is successfully executed");

	}

}
