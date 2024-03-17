package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com");

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("//*[contains(text(),'Customers')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),'Activity log')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("ActivityLogTypeId")).click();
		Thread.sleep(2000);

		WebElement customer = driver.findElement(By.id("ActivityLogTypeId"));

//		customer.click();
//		Thread.sleep(3000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//
//		customer.sendKeys(Keys.ENTER);

		Select selection = new Select(customer);

		selection.selectByIndex(4);
		Thread.sleep(2000);

		selection.selectByValue("147");
		Thread.sleep(2000);

		selection.selectByVisibleText("Add a new country");
		Thread.sleep(2000);

//		selection.deselectByVisibleText("Add a new country");
//		Thread.sleep(2000);
//		

		selection.selectByVisibleText("Add a new customer");
		Thread.sleep(2000);
		

		selection.selectByVisibleText("Add a new discount");
		Thread.sleep(2000);

		
		Select select = new Select(customer);
		select.deselectByValue("147");
		System.out.println("deselect 147");
		
		
//		selection.selectByVisibleText("Add a new language");
//		Thread.sleep(2000);
//
//		selection.selectByVisibleText("Add a new product");
//		Thread.sleep(2000);
//
//		selection.selectByVisibleText("Add a new store");
//		Thread.sleep(2000);

		

		driver.close();
		
				

	}

}
