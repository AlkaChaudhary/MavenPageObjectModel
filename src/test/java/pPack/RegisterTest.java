package pPack;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import objectRepository.NLabsPage;
import objectRepository.RegisterAcctPage;
import objectRepository.SucessAcctPage;

public class RegisterTest {
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
		rp.emailField().sendKeys("alka17@gmail.com");
		rp.telephoneField().sendKeys("1234567821");
		rp.passwordField().sendKeys("Standard");
		rp.passwordConfirmField().sendKeys("Standard");
		rp.agreeChkBoxField().click();
		rp.submitBtnField().click();
		SucessAcctPage sp= new SucessAcctPage(driver);
		AssertJUnit.assertTrue(sp.sucessBread().isDisplayed());
    }
	@AfterMethod
	public void closure(){
		//driver.quit();
	}
}