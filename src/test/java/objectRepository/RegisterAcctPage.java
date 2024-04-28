package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAcctPage {
	WebDriver driver;
	public RegisterAcctPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement passwordConfirm;
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreeChkBox;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitBtn;
	public WebElement firstNameField() {
		return firstName;
	}
	public WebElement lastNameField() {
		return lastName;
	}
	public WebElement emailField() {
		return email;
	}
	public WebElement telephoneField() {
		return telephone;
	}
	public WebElement passwordField() {
		return password;
	}
	public WebElement passwordConfirmField() {
		return passwordConfirm;
	}
	public WebElement agreeChkBoxField() {
		return agreeChkBox;
	}
	public WebElement submitBtnField() {
		return submitBtn;
	}
}
