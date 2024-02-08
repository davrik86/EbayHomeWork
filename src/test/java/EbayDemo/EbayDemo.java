package EbayDemo;

import org.openqa.selenium.WebElement;

import Utils.BrowserUtils;
import Utils.DataReader;
import Utils.Driver;
import page.EbayDemoForListofItems;

public class EbayDemo {
public static void main(String[] args) {
	Ebaytest();
}
public static void Ebaytest() {
	EbayDemoForListofItems test= new EbayDemoForListofItems();
	BrowserUtils utils= new BrowserUtils();
	Driver.getDriver().get(DataReader.getProperty("ebay_url"));
	utils.waitForElementToBeVisible(test.searchBox);
	test.searchBox.sendKeys(DataReader.getProperty("item"));
	test.searBtn.click();
	
	for (WebElement price: test.pricing) {
		System.out.println(price.getText());
	}
}
}
