package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-email")
	WebElement email;
	@FindBy(id="input-password")
	WebElement password;
	@FindBy(css="input[value='Login'")
	WebElement LoginBtn;
	

	public WebElement emailField() {
		return email;
	}
	public WebElement passwordField() {
		return password;
	}
			
	public WebElement loginButtonField() {
		return LoginBtn;
	}	
	
}
