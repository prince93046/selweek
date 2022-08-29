package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPageActitime {
	WebDriver driver;
	public CreateNewCustomerPageActitime (WebDriver driver) {
	PageFactory.initElements(driver, this);
	this. driver= driver;
}

	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterNewCustomerTxtField;
	
	/*public WebElement getEnterNewCustomerTxtField() {
		return enterNewCustomerTxtField;
	}
	public WebElement getDescriptionTextfield() {
		return descriptionTextfield;
	}*/

	@FindBy (xpath ="//textarea(@placeholder='Enter Customer Description']")
	private WebElement descriptionTextfield;
	
	@FindBy (xpath="//div[text ()='- Select Customer -']")
	private WebElement selectCustomerDropdown;
	
	@FindBy (xpath ="(//div[text() = 'Automation Engineer'][2]")
	private WebElement optionToSelect;
	
	@FindBy (xpath = "//div(text()='Create Customer']")
	private WebElement createCustomerButton;
	public WebDriver getDriver() {
	return driver;
	}
	public WebElement getEnterNewCustomerTxtfield() {
		return enterNewCustomerTxtField;
	}
		
		public WebElement getDescriptionTextField() {
			return descriptionTextfield;
		}
		public WebElement getSelectCustomerDropdown() {
			return selectCustomerDropdown;
		}
			
			public WebElement getOptionToSelect( ) {
				return optionToSelect;
			}
			
			public WebElement getCreateCustomerButton() {
				return createCustomerButton;
				
			}
			
			public void createCustomer(String customerName, String description) {
				enterNewCustomerTxtField.sendKeys(customerName);
				descriptionTextfield.sendKeys(description);
				selectCustomerDropdown.click();
				Actions action=new Actions(driver);
				action.moveByOffset(150, 320).click().perform();
			//	optionToSelect.click();
				createCustomerButton.click();
				
		
		}
		

}
