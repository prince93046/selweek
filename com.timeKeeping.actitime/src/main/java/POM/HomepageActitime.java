package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageActitime {
	
	WebDriver driver;
	public HomepageActitime(WebDriver driver ) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy (id = "container_tasks")     //Create Getter setter  from right click -->source-->generate geter setter
	private WebElement taskButton;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getCustomerName() {
		return CustomerName;
	}
	
	public WebElement getAddNewButton() {
		return AddNewButton;
	}
	
	public WebElement getNewCustomerButton() {
		return NewCustomerButton;
		
	}

	public WebElement getTaskButton( ) {
		return taskButton;
	}
	
	public void clickOnTask( ) {
		taskButton.click();
			
	}

}
