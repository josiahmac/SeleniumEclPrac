package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex1 {
	
	/*
	 * Gender - Male radio button
	 * ID: gender-male
	 * 
	 * First name text box
	 * ID: FirstName
	 * 
	 * Last name text box
	 * ID: LastName
	 * 
	 * Email text box
	 * ID: Email
	 * 
	 * Password text box
	 * ID: Password
	 * 
	 * Confirm password text box
	 * ID: ConfirmPassword
	 * 
	 * Register button
	 * ID: register-button
	
	*/
	
	public static void main(String[] args) {
		WebDriver driver;
		By registerLink = By.linkText("Register");
		By gender = By.id("gender-male");
		By fName = By.id("FirstName");
		By lName = By.id("LastName");
		By email = By.id("Email");
		By password = By.name("Password");
		By confirmPass = By.name("ConfirmPassword");
		By registerButton = By.name("register-button");
		
		
	    
		
		
		driver = new EdgeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(registerLink).click();
		driver.findElement(gender).click();
		driver.findElement(fName).sendKeys("Hakdog");
		driver.findElement(lName).sendKeys("Hakhak");
		driver.findElement(email).sendKeys("hak.mail@mail.com");
		driver.findElement(password).sendKeys("password1");
		driver.findElement(confirmPass).sendKeys("password1");
		driver.findElement(registerButton).click();
		
		
		
	}
}
