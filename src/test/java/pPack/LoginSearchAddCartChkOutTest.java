package pPack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.CheckoutPage;
import objectRepository.LoginPage;
import objectRepository.MyAccountPage;
import objectRepository.NLabsPage;
import objectRepository.ProductPage;
import objectRepository.SuccessAddCartPage;
import objectRepository.SucessCheckOutPage;
import objectRepository.SucessProductPage;

public class LoginSearchAddCartChkOutTest {
	WebDriver driver;
	@Test
	public void sampleTest() {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://naveenautomationlabs.com/opencart/");
	NLabsPage np = new NLabsPage(driver);
	np.myAccountField().click();
	np.loginOptionField().click();
	LoginPage lp = new LoginPage(driver);
	lp.emailField().sendKeys("alka@gmail.com");
	lp.passwordField().sendKeys("Standard");
	lp.loginButtonField().click();
	MyAccountPage mp= new MyAccountPage(driver);
	AssertJUnit.assertTrue(mp.accountBread().isDisplayed());	
	mp.searchTxtField().sendKeys("Samsung SyncMaster");
	mp.searchBtnField().click();
	SucessProductPage spa=new SucessProductPage(driver);
	AssertJUnit.assertTrue(spa.sucessField().isDisplayed());
	spa.productGridField().click();
	ProductPage pp=new ProductPage(driver);
	pp.quantityTxtBoxField().clear();
	pp.quantityTxtBoxField().sendKeys("3");
	pp.addCartBtnField().click();
	SuccessAddCartPage scp= new SuccessAddCartPage(driver);
	AssertJUnit.assertTrue(scp.sucessBread().isDisplayed());
	String expectedsucessmsg="Success: You have added Samsung SyncMaster 941BW to your shopping cart!";
	String actualsucessmsg=scp.actualSucessMsgField().getText();
	//Assert.assertEquals(actualsucessmsg, expectedsucessmsg);
	AssertJUnit.assertTrue(actualsucessmsg.contains(expectedsucessmsg));
	
	/*Select select = new Select(scp.addCartItemsField());
	select.selectByVisibleText("Checkout");*/
	scp.addCartItemsField().click();
	scp.chkoutBtnField().click();
	CheckoutPage cp=new CheckoutPage(driver);
	cp.newAddressChkBoxField().click();
	cp.firstNameField().sendKeys("Alka1");
	System.out.println("Print after entring the first name value");
	cp.lastNameField().sendKeys("Chaudhary");
	cp.address1Field().sendKeys("Address1");
	cp.cityField().sendKeys("Vallensbæk");
	cp.postalCodeField().sendKeys("234000");
	Select select1 = new Select(cp.contryField());
	select1.selectByVisibleText("Denmark");
	Select select2 = new Select(cp.stateField());
	select2.selectByVisibleText("Copenhagen");
	cp.billingContinueBtnField().click();
	cp.deliveryDetailContinueBtnField().click();
	cp.deliveryMethodContinueBtnField().click();
	cp.agreeChkBoxField().click();
	cp.paymentContinueBtnField().click();
	cp.confirmOrderBtn().click();
	SucessCheckOutPage sop= new SucessCheckOutPage(driver);
	AssertJUnit.assertTrue(sop.breadcrumbSucessField().isDisplayed());
	String expectedsucessmsg1="Your order has been placed!";
	String actualsucessmsg1=sop.chkOutSucessMsgField().getText();
	AssertJUnit.assertEquals(actualsucessmsg1, expectedsucessmsg1);
	
	}
	@AfterMethod
	public void closure() {
		//driver.quit();
	}
	
}
