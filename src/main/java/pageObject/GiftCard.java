package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserHelper;


public class GiftCard extends UserHelper{
	
	
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/select/option[4]")
    private static WebElement sortHLDrop;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/select/option[2]")
    private static WebElement viewLDrop;

	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
    private static WebElement addToCartButton;
	
	@FindBy(className = "recipient-name")
    private static WebElement recipientNField;
	
	@FindBy(className = "message")
    private static WebElement messageField;
	
	@FindBy(className = "qty-input")
    private static WebElement qtyField;
	
	@FindBy(className = "add-to-cart-button-4")
    private static WebElement addToCart2Button;
	
	public GiftCard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}