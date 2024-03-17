package ncTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swd_verificationmethod {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com");
		
		
		boolean val = driver.findElement(By.id("Email")).isDisplayed();
		System.out.println("Email is appearing? "+val);

		boolean val1 = driver.findElement(By.id("RememberMe")).isSelected();
		System.out.println("RememberMe Checkbox is selected? "+val1);

		boolean val2 = driver.findElement(By.tagName("button")).isEnabled();
		System.out.println("Login button is Enabled? "+val2);

	

		
		driver.quit();

	}

}
