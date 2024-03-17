package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example2 {

	public static void main(String[] args) throws Exception {

		// Launch ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the chromeBrowser
		driver.manage().window().maximize();

		// Open NC login page in opened Browser
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		// Enter Valid Email in Email field
		driver.findElement(By.id("Email")).clear();
	
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(1000);

		
		// Enter Valid password in Password field
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(1000);

		
		// Click on Login button
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		// Terminate the ChromeBrowser
		driver.quit();
	}

}
