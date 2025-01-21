package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenshotUtility;

public class BaseClass {

	public WebDriver driver;
	public static Properties prop; // prop is the reference variable of Class Properties

	public static void testBasic() throws IOException {

		prop = new Properties(); // create object for Properties class
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//Config.properties");
		prop.load(ip); // it will load the file to the framework
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String browser) throws IOException {

		testBasic();

		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
		}

		//driver = new ChromeDriver();
		driver.get(prop.getProperty("baseurl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility ssutility = new ScreenshotUtility();
			ssutility.captureScreenShotForFailedTestcase(driver, iTestResult.getName());
		}

		driver.close();
	}
}
