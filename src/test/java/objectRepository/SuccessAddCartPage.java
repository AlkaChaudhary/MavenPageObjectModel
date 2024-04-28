package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessAddCartPage {
	WebDriver driver;
	public SuccessAddCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Samsung SyncMaster 941BW']")
	WebElement sucess;
	@FindBy(xpath="//div[contains(@class,'alert-success')]")
	WebElement actualSucessMsg;
	@FindBy(xpath="//div[@id='cart']//i[contains(@class,'fa-shopping')]")
	WebElement addCartItems;
	@FindBy(xpath="//span[contains(text(),'Checkout')]")
	WebElement chkoutBtn;
	public WebElement sucessBread() {
		return sucess;
	}
	public WebElement actualSucessMsgField() {
		return actualSucessMsg;
	}
	public WebElement addCartItemsField() {
		return addCartItems;
	}
	public WebElement chkoutBtnField() {
		return chkoutBtn;
	}
}
