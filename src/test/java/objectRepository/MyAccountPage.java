package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Account']")
	WebElement account;
	@FindBy(xpath="//input[@name='search']")
	WebElement searchTxt ;
	@FindBy(xpath="//button[contains(@class,'btn-default')]")
	WebElement searchBtn ;
	public WebElement accountBread() {
		return account;
	}
	public WebElement searchTxtField() {
		return searchTxt;
	}
	public WebElement searchBtnField() {
		return searchBtn;
	}
}

