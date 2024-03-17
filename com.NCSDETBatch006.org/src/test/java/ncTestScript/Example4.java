package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {

	public static void main(String[] args)  throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='Email']")).clear();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(1000);

		
		
		driver.findElement(By.xpath("//input[@name='Password']")).clear();
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();


		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		
		// Terminate the ChromeBrowser
		driver.quit();
	}

}