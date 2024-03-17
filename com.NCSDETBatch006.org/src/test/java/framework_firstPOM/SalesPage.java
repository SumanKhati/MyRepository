package framework_firstPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 Create a class for a Web Page
public class SalesPage {
	
	

		WebDriver driver;

		// Rule-2 Provide the Web Elements information
		
		By product=By.id("search-product-name");
		By searchBtn = By.id("search-orders");
		
	
	// Rule-3 Create the methods for each web elements // public void
		
		
		
		
		public void clickOnPoduct() { 
			  driver.findElement(product).click();
			  driver.findElement(product).sendKeys("Books");
			  
		  }
		
		 public void clickOnSearch() {
			 driver.findElement(searchBtn).click();
			 
		 }
		

		//Rule-4 Create the constructor for each page class with WebDriver object as argument
			public SalesPage(WebDriver d){
				this.driver = d;
				
			}

		

	}

		  
		  
		  
//		By products = By.xpath("//*[@id='search-product-name']");
//		
//		By search = By.xpath("//*[@id='search-orders']");
		
		
		
		
		
//		// Rule-2 Provide the Web Elements information
//		By productsCheckbox = By.xpath("//table[@id='products-grid']/tbody/tr[1]/td[1]/input");
//		By deleteBtn = By.id("delete-selected");
//		By yesBtn = By.xpath("//button[contains(text(), 'Yes')]");
//
//		// Rule-3 Create the methods for each web elements
//		public void selectProduct() {
//			driver.findElement(productsCheckbox).click();
//		}
//
//		public void clickOnDelete() {
//			driver.findElement(deleteBtn).click();
//		}
//
//		public void clickOnYes() {
//			driver.findElement(yesBtn).click();
//		}
		
		//Rule-4 Create the constructor for each page class with WebDriver object as argument
//		public SalesPage(WebDriver d){
//			this.driver = d;
//		}
//
//	
//
//}
