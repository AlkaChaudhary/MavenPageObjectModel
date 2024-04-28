package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
		WebDriver driver;
		public ProductPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@name='quantity']")
		WebElement quantityTxtBox;
		@FindBy(xpath="//button[@id='button-cart']")
		WebElement addCartBtn;

		public WebElement quantityTxtBoxField() {
			return quantityTxtBox;
		}
		public WebElement addCartBtnField() {
			return addCartBtn;
		}

}
