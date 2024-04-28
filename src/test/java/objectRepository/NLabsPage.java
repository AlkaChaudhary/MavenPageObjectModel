package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NLabsPage {
WebDriver driver;

public NLabsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@title='My Account']")
WebElement myAcctdropdown;
@FindBy(xpath="//a[text()='Login']")
WebElement loginOption;
@FindBy(xpath="//a[text()='Register']")
WebElement registerOption;

public WebElement myAccountField() {
	return myAcctdropdown;
}
public WebElement loginOptionField() {
	return loginOption;
}
public WebElement registerOptionField() {
	return registerOption;
}
}
