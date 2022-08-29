package demoqa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_TextBox {
	
	WebDriver driver;
	
	public  Element_TextBox(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	@FindBy (xpath="//*[@id="app"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]/text()")
	private WebElement sideMenuElement_Link;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSideSubMenu_TextBox() {
		return sideSubMenu_TextBox;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCurrent_AddressTextField() {
		return current_AddressTextField;
	}

	public WebElement getPermanemtAddressTextField() {
		return permanemtAddressTextField;
	}

	public WebElement getClickOnSubmitButton() {
		return clickOnSubmitButton;
	}

	@FindBy (xpath="//span[text()='Text Box']")
	private WebElement sideSubMenu_TextBox;
	
	@FindBy (id="userName")
	private WebElement fullNameTextField;
	
	@FindBy (id="userEmail")
	private WebElement emailTextField;
	
	@FindBy (id="currentAddress")
	private WebElement current_AddressTextField;
	
	@FindBy (id="permanentAddress")
	private WebElement permanemtAddressTextField;
	
	
	@FindBy (id="submit")
	private WebElement clickOnSubmitButton;
	
	// Creating Methods............
	
	public WebElement getSideMenuElement_Link( ) {
		return sideMenuElement_Link; 
	}
	
	public WebElement getSideSubMenu_TextBox1( ) {
		return sideSubMenu_TextBox; 
	}
	
	public WebElement getFullNameTextField( ) {
		return fullNameTextField; 
	}
	
	public WebElement getemailTextField( ) {
		return emailTextField; 
	}
	
	public WebElement getcurrent_AddressTextField( ) {
		return current_AddressTextField; 
	}
	
	public WebElement getpermanemtAddressTextField( ) {
		return permanemtAddressTextField; 
	}
	
	public WebElement getclickOnSubmitButton( ) {
		return clickOnSubmitButton; 
	}
	
	// Bussiness Logic.........
	
	public void loginAction(String name, String email , String currentAddress, String permananetAddress) {
		
		sideMenuElement_Link.click();
	/*	sideSubMenu_TextBox.click();
		fullNameTextField.sendKeys(name);
		emailTextField.sendKeys(email);
		current_AddressTextField.sendKeys(currentAddress);
		permanemtAddressTextField.sendKeys(permananetAddress);
		clickOnSubmitButton.click();
		*/
		
		
	}


}
