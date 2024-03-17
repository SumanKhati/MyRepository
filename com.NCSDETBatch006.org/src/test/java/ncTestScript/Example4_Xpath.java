package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_Xpath {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='Rememberme']")).click();


		driver.findElement(By.xpath("//button[@type='Submit']")).click();
         Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@href='/logout']")).click();

		driver.quit();
	}

}
