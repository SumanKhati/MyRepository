package ncTestScript;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwdMethodExample2 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(1000);

		driver.findElement(By.id("APjFqb")).sendKeys(" Selenium WebDriver method");
		Thread.sleep(1000);

		// Current Page Source Code
		String SourceCode = driver.getPageSource();
		System.out.println(SourceCode);

		// Current Page Title
		String val = driver.getTitle();
		System.out.println(val);

		// CurrentPageUrl
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
	

		// WindowUniqueId
		String WinId = driver.getWindowHandle();
		System.out.println(WinId);

		
		

		driver.quit();

	}

}
