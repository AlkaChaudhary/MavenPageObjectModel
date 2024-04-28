package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SucessAcctPage {
	WebDriver driver;
	public SucessAcctPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Success']")
	WebElement sucess;
	@FindBy(xpath="//div[@class='buttons']//a[text()='Continue']")
	WebElement continueBtn;
	public WebElement sucessBread() {
		return sucess;
	}
	public WebElement continueBtnField() {
		return continueBtn;
	}

}
