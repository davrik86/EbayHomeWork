package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class EbayDemoForListofItems {
	
	public EbayDemoForListofItems() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
		//search box
		@FindBy (xpath="//input[@id=\"gh-ac\"]")
		public WebElement searchBox;
		// search Bttn
		@FindBy (xpath="//input[@type=\"submit\"]")
		public WebElement searBtn;
		
		//search result
		@FindBy (xpath= "//*[@id=\"srp-river-results\"]/ul")
		public List<WebElement> listitems;
		
		//price locator
		@FindBy (xpath="//span[@class=\"s-item__price\"]")
		public List<WebElement> pricing;
		
		//item name
		@FindBy (xpath="//span[@role=\"heading\"]")
		public List<WebElement> itemName;
		
}
