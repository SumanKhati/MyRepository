package ncTestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethodclass {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		Thread.sleep(2000);


		//driver.findElement(By.xpath("//span[contains(text(),'+91')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).sendKeys("9501671094");
		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//
		driver.findElement(By.xpath("//a[contains(text(), 'Enter Mobile number')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='_1fqY3P']")).sendKeys("+91");
		Thread.sleep(2000);

//		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Home & Furniture')]"))).perform();
//
//		Thread.sleep(2000);
						
//		action.click().perform();
//		
//		Thread.sleep(2000);

		driver.quit();

	}


}
