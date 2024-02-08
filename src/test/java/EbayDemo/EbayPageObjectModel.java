package EbayDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BrowserUtils;
import Utils.Driver;
import page.EbayDemoForListofItems;
import Utils.DataReader;

public class EbayPageObjectModel {
	
public static void main(String[] args) {
	EbaySearchListDemo();
}

public static void EbaySearchListDemo() {
	EbayDemoForListofItems search= new EbayDemoForListofItems();
	BrowserUtils utils= new BrowserUtils();
	Driver.getDriver().manage().window().maximize();
	Driver.getDriver().get(DataReader.getProperty("ebay_url"));
	utils.waitForElementToBeVisible(search.searchBox);
	search.searchBox.sendKeys(DataReader.getProperty("item"));
	search.searBtn.click();
	//this one for items and price of each listed item
	
	for (WebElement item : search.pricing) {
		//for (WebElement price: search.itemName) {
			System.out.println(item.getText() );
		// price.getText());
		}
		
}	
	
		
	
}

