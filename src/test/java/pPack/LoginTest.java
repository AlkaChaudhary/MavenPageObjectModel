package pPack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import objectRepository.MyAccountPage;
import objectRepository.NLabsPage;

public class LoginTest {
WebDriver driver;
@Test
public void sampleTest() {
	driver= new FirefoxDriver();
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
}
@AfterMethod
public void closure() {
	//driver.quit();
}
}
