
package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swdmethod_Example4 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com");
		Thread.sleep(3000);

	
		
		//getAttribute (
		String value2 = driver.findElement(By.id("Email")).getAttribute("name");
		System.out.println(value2);
		
		//getTagName (print tagName )
		String value3 = driver.findElement(By.name("Email")).getTagName();
		System.out.println(value3);

		//getText
		String value1 = driver.findElement(By.tagName("Button")).getText();
		System.out.println(value1);
		
		//sendKeys (enter the data)
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		
		//sendKeys (using keyboard function)
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin",Keys.TAB,Keys.TAB,Keys.ENTER);
		Thread.sleep(5000);
		
	
		
		//close entire window
		driver.quit();

	}


}
