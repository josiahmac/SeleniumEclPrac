package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserHelper;

public class Login extends UserHelper{
	
	
	@FindBy(id="Email")
    private static WebElement emailField;
	
	@FindBy(id="Password")
    private static WebElement passwordField;

	@FindBy(className ="button-1 login-button")
    private static WebElement loginButton;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}