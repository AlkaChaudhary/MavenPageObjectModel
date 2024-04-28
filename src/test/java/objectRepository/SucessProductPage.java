package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SucessProductPage {
WebDriver driver;
public SucessProductPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Search']")
WebElement sucess;
@FindBy(xpath="//div[contains(@class,'product-grid')]//img[@title='Samsung SyncMaster 941BW']")
WebElement productGrid;
@FindBy(xpath="//div[@class='btn-group']//i[contains(@class,'fa-shopping')]")
WebElement productWishlistBtn;
@FindBy(xpath="//div[contains(@class,'alert-success')]")
WebElement sucessWishlist; 
public WebElement sucessField() {
	return sucess;
}
public WebElement productGridField() {
	return productGrid;
}
public WebElement productWishlistField() {
	return productWishlistBtn;
}
public WebElement sucessWishlistField() {
	return sucessWishlist;
}
}