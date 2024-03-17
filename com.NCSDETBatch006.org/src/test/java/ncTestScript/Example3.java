package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);

		driver.findElement(By.partialLinkText("premium")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
