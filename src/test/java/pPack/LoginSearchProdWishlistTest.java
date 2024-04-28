package pPack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import objectRepository.MyAccountPage;
import objectRepository.NLabsPage;
import objectRepository.SucessProductPage;

public class LoginSearchProdWishlistTest {
WebDriver driver;
@Test
public void sampleTest() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://naveenautomationlabs.com/opencart/");
NLabsPage np = new NLabsPage(driver);
np.myAccountField().click();
np.loginOptionField().click();
LoginPage lp = new LoginPage(driver);
lp.emailField().sendKeys("alka1@gmail.com");
lp.passwordField().sendKeys("Standard");
lp.loginButtonField().click();
MyAccountPage mp= new MyAccountPage(driver);
AssertJUnit.assertTrue(mp.accountBread().isDisplayed());	
mp.searchTxtField().sendKeys("iPhone");
mp.searchBtnField().click();
SucessProductPage spa=new SucessProductPage(driver);
AssertJUnit.assertTrue(spa.sucessField().isDisplayed());
spa.productWishlistField().click();
String actualsucessmsg=spa.sucessWishlistField().getText();
String expectsucessmsg="Success: You have added iPhone to your wish list!";
System.out.println(expectsucessmsg);
System.out.println(actualsucessmsg);
//Assert.assertEquals(expectsucessmsg, actualsucessmsg);
AssertJUnit.assertTrue(actualsucessmsg.contains(expectsucessmsg));
//Assert.assertTrue(expectsucessmsg.contains(actualsucessmsg));
}
@AfterMethod
public void closure() {
	driver.quit();
}
}
