package ncTestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptions {

	public static void main(String[] args) throws Exception {

		

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com");
		Thread.sleep(1000);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),'Catalog')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(text(),'Products')]")).click();
		Thread.sleep(2000);
		
		WebElement category = driver.findElement(By.id("SearchCategoryId"));
		
		Select selection = new Select(category);
		 List<WebElement> allOptions = selection.getOptions();
		 
		 for(WebElement singleOption :allOptions) {
			 
			 
			 String text = singleOption.getText();
			 
			 System.out.println(text);
			 
			 
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
