package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SucessCheckOutPage {
	WebDriver driver;
	public SucessCheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Success']")
	WebElement breadcrumbSucess;
	@FindBy(xpath="//h1[text()='Your order has been placed!']")
	WebElement chkOutSucessMsg;
	public WebElement breadcrumbSucessField()
	{
		return breadcrumbSucess;
	}
	public WebElement chkOutSucessMsgField()
	{
		return chkOutSucessMsg;
	}
}
