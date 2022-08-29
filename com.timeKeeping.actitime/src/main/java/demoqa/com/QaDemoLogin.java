/**
 * 
 */
package demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author princ
 *
 */
public class QaDemoLogin {
	
	// Initialise the Webdriver
	WebDriver driver;         //This will perform activity
	
	//Create Constructor for WebDriver
	
        public QaDemoLogin(WebDriver driver) {                  //Driver1 is comes from page factory which initialized the Local WebDriver.
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy  (id="userName")
	private WebElement usernameTextField;
	
	@FindBy (id="password")
	private WebElement passwordTextField;
	
	@FindBy (id="login")
	private WebElement loginButton;
	
	//Now creating Meaningful Methods............
	
	public WebElement getUsernameTextField( ) {
		return usernameTextField; 
	}
	
	public WebElement getPasswordTextField( ) {
		return passwordTextField; 
	}
	
	public WebElement ClickOnLoginButton( ) {
		return loginButton; 
	}
	
	
	
	
	// Business Logic
	
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	
	}
	
	
		
		



	
	
	
	
	
	
	
	
	
	
	
	

}
