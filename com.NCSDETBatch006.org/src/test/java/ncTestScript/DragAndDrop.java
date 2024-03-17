package ncTestScript;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(2000);

		driver.switchTo().frame(2);

		Thread.sleep(1000);

		WebElement source = driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));

		WebElement target = driver.findElement(By.id("trash"));

		Actions action = new Actions(driver);

		action.dragAndDrop(source, target).perform();


		WebElement source2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
		action.dragAndDrop(source2, target).perform();
		Thread.sleep(500);

		
		WebElement source3 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		action.dragAndDrop(source3, target).perform();
		Thread.sleep(500);

		
		WebElement source4 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		action.dragAndDrop(source4, target).perform();
		
		Thread.sleep(7000);

		driver.quit();
		
		
		
	
		
		
	}

}
