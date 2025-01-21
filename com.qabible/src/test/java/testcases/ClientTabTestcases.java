package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.ConstantClass;
import elementRepository.ClientsPage;
import elementRepository.LoginPage;
import utilities.ExcelReadUtility;

public class ClientTabTestcases extends BaseClass {

//3.Open the application --> Login to the application --> Navigate to "Client" menu --> verify the tooltip value for "Edit" icon for any row in the table.  
	@Test(groups = "Low", dataProvider = "logindataprovider",dataProviderClass = ExcelReadUtility.class)
	public void verifyTooltipValueForEditIconForAnyRowInTheTableInClientPage(String username,String password) {
		LoginPage lp = new LoginPage(driver);
//		lp.inputUsername("carol");
//		lp.inputPassword("1q2w3e4r");
//		lp.clickLogin();
		lp.performLogin(username, password);

		ClientsPage ct = new ClientsPage(driver);
		ct.clickClientTab();
		String actual1 = ct.verifyEditToolTip();
		String expected1 = "Update";
		Assert.assertEquals(actual1, expected1, ConstantClass.errorMessageForClientTestCase);
		System.out.println("Testcase 3 is successfully executed");
	}

//5.Open the application --> Login to the application --> Navigate to "Client" menu -->Click "Create Client" sub menu --> Select the check-box - "Require Po" and verify the same is selected.

	@Test(groups = "Critical", dataProvider = "logindataprovider",dataProviderClass = ExcelReadUtility.class)

	public void verifyRequireProRadioButtonIsSelected(String username,String password) {
		LoginPage lp = new LoginPage(driver);
//		lp.inputUsername("carol");
//		lp.inputPassword("1q2w3e4r");
//		lp.clickLogin();
		lp.performLogin(username, password);
		
		ClientsPage cp = new ClientsPage(driver);
		cp.clickClientTab();
		cp.clickOnCreateClient();

		boolean actualresult = cp.isRequiredProCheckboxSelected();
		boolean expectedresult = false;

		Assert.assertEquals(actualresult, expectedresult, ConstantClass.errorMessageForClientTestCase);
		

	}

}
