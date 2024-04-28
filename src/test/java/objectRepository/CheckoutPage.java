package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='payment_address'and @value='new']")
	WebElement newAddressChkBox;
	@FindBy(xpath="//input[@id='input-payment-firstname']")
	WebElement firstName;
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	WebElement lastName;
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	WebElement address1;
	@FindBy(xpath="//input[@id='input-payment-city']")
	WebElement city;
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	WebElement postalCode;
	@FindBy(id="input-payment-country")
	WebElement country;
	@FindBy(id="input-payment-zone")
	WebElement state;
	@FindBy(xpath="//input[@id='button-payment-address'and @value='Continue']")
	WebElement billingContinueBtn;
	@FindBy(xpath="//input[@id='button-shipping-address'and @value='Continue']")
	WebElement deliveryDetailContinueBtn;
	@FindBy(xpath="//input[@id='button-shipping-method'and @value='Continue']")
	WebElement deliveryMethodContinueBtn;
	@FindBy(xpath="//input[@type='checkbox'and @name='agree']")
	WebElement agreeChkBox;
	@FindBy(xpath="//input[@id='button-payment-method'and @value='Continue']")
	WebElement paymentContinueBtn;
	@FindBy(xpath="//input[@id='button-confirm']")
	WebElement confirmOrderBtn;
	public WebElement newAddressChkBoxField()
	{
		return newAddressChkBox;
	}
	public WebElement firstNameField()
	{
		return firstName;
	}
	public WebElement lastNameField()
	{
		return lastName;
	}
	public WebElement address1Field()
	{
		return address1;
	}
	public WebElement cityField()
	{
		return city;
	}
	public WebElement postalCodeField()
	{
		return postalCode;
	}
	public WebElement contryField()
	{
		return country;
	}
	public WebElement stateField()
	{
		return state;
	}
	public WebElement billingContinueBtnField()
	{
		return billingContinueBtn;
	}
	public WebElement deliveryDetailContinueBtnField()
	{
		return deliveryDetailContinueBtn;
	}
	public WebElement deliveryMethodContinueBtnField()
	{
		return deliveryMethodContinueBtn;
	}
	public WebElement agreeChkBoxField()
	{
		return agreeChkBox;
	}
	public WebElement paymentContinueBtnField()
	{
		return paymentContinueBtn;
	}
	public WebElement confirmOrderBtn()
	{
		return confirmOrderBtn;
	}
	
}
