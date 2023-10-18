package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserHelper;

public class HomePage extends UserHelper{
	
	
	@FindBy(className="ico-login")
    private static WebElement loginLink;
	
	@FindBy(className="ico-cart")
    private static WebElement cartLink;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")
    private static WebElement gcLink;
	
	

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
