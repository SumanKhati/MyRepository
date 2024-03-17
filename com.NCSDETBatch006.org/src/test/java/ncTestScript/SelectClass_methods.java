package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class SelectClass_methods {

	public static void main(String[] args) throws InterruptedException  {

	WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com");
		Thread.sleep(1000);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),'Products')]")).click();
		Thread.sleep(2000);

		WebElement dropdown = driver.findElement(By.id("SearchProductTypeId"));
		
		Select selection = new Select(dropdown);
		selection.selectByVisibleText("Grouped (product with variants)");

		driver.quit();

	}

}
