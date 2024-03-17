package framework_TestCase;

import org.openqa.selenium.chrome.ChromeDriver;

import framework_firstPOM.Dashboard;
import framework_firstPOM.GenericUtility;
import framework_firstPOM.LoginPage;

public class loginValidate {
	

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();

		LoginPage lp = new LoginPage(driver);
		Dashboard dash = new Dashboard(driver);
		GenericUtility gut = new GenericUtility(driver);

		gut.setUp();
		lp.enterEmail();
		lp.enterPassword();
		lp.clickOnLoginBtn();
		Thread.sleep(5000);
		dash.verifyDashboard();
		gut.doLogout();
		Thread.sleep(5000);
		gut.tearDown();

	}


	}


