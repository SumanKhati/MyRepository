package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example5 {

	public static void main(String[] args) throws Exception{

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("admin@yourstore.com");
	

		driver.findElement( By.xpath("//*[@id='Password']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@type='checkbox'])|(//*[@id='RememberMe'])")).click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[@taxt()='Dashboard']")).click();
		
		driver.findElement(By.xpath("//*[starts-with(text(),'Learn more')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		
		// Terminate the ChromeBrowser
		driver.quit();
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
