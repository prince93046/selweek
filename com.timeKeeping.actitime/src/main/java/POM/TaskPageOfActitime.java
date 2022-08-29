package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPageOfActitime {
	WebDriver driver;
	public TaskPageOfActitime(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy (xpath = "//div[text() = 'Add New']")
			private WebElement addNewButton;
	
	@FindBy (xpath = "//div[text() = '+ New Customer']")
	private WebElement newCustomerButton;
	

	public WebElement getAddNewButton() {
		return addNewButton;
		
	}
	
	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}
	
	public void clickOnAddNewButton( ) {
		addNewButton.click();
	}
	
	public void clickOnNewCustomer() {
		newCustomerButton.click();
	}
}
		
		
			
		
		
		

