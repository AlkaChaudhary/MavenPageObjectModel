package pPack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.MyAccountPage;
import objectRepository.NLabsPage;
import objectRepository.ProductPage;
import objectRepository.RegisterAcctPage;
import objectRepository.SuccessAddCartPage;
import objectRepository.SucessAcctPage;
import objectRepository.SucessProductPage;

public class RegisterUserSearchProductAddCartTest {
WebDriver driver;
@Test
public void sampleTest() {
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://naveenautomationlabs.com/opencart/");
NLabsPage np = new NLabsPage(driver);
np.myAccountField().click();
np.registerOptionField().click();
RegisterAcctPage rp=new RegisterAcctPage(driver);
rp.firstNameField().sendKeys("Alka");
rp.lastNameField().sendKeys("Chaudhary");
rp.emailField().sendKeys("alka27@gmail.com");
rp.telephoneField().sendKeys("1234567821");
rp.passwordField().sendKeys("Standard");
rp.passwordConfirmField().sendKeys("Standard");
rp.agreeChkBoxField().click();
rp.submitBtnField().click();
SucessAcctPage sp= new SucessAcctPage(driver);
AssertJUnit.assertTrue(sp.sucessBread().isDisplayed());
sp.continueBtnField().click();
MyAccountPage mp= new MyAccountPage(driver);
mp.searchTxtField().sendKeys("iPhone");
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
String expectedsucessmsg="Success: You have added iPhone to your shopping cart!";
String actualsucessmsg=scp.actualSucessMsgField().getText();
//Assert.assertEquals(actualsucessmsg, expectedsucessmsg);
AssertJUnit.assertTrue(actualsucessmsg.contains(expectedsucessmsg));
}
@AfterMethod
public void closure() {
	driver.quit();
}
}