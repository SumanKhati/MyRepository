package ncTestScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swdmethod_Example3 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(1000);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		// driver.findElement(By.linkText("Get the plugin")).click();
		// Thread.sleep(1000);

		driver.findElement(By.xpath("//*[contains(text(),'Help')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),' Training')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),' Documentation')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),' Community forums')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),' Premium support services')]")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Solution partners')]")).click();

		
		Thread.sleep(2000);


		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);

		driver.close();
		Thread.sleep(7000);
		
		
		driver.quit();

		

	}

}
