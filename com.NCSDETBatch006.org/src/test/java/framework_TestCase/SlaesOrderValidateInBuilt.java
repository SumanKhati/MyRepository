package framework_TestCase;

import org.openqa.selenium.chrome.ChromeDriver;

import framework_firstPOM.Dashboard;
import framework_firstPOM.GenericUtility;
import framework_firstPOM.LoginPage;
import framework_firstPOM.SalesPage;

public class SlaesOrderValidateInBuilt {

	public static void main(String[] args) throws Exception {

		
		
		
		ChromeDriver driver = new ChromeDriver();

		LoginPage lp = new LoginPage(driver);
		Dashboard dash = new Dashboard(driver);
		SalesPage sp = new SalesPage(driver);
		GenericUtility gut = new GenericUtility(driver);

		gut.setUp();
		lp.enterEmail();
		lp.enterPassword();
		lp.clickOnLoginBtn();
		Thread.sleep(1000);
		
		dash.verifyDashboard();
		
		gut.clickOnSales();
		Thread.sleep(1000);
		gut.clickOnOrder();
		Thread.sleep(1000);
		sp.clickOnPoduct();
		Thread.sleep(1000);
		sp.clickOnSearch();
		Thread.sleep(3000);

		gut.doLogout();
		Thread.sleep(1000);
		gut.tearDown();
	}

}
