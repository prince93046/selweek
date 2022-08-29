package com.timeKeeping.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.CreateNewCustomerPageActitime;
import POM.HomepageActitime;
import POM.LoginPage;
import POM.TaskPageOfActitime;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	@Test
	public void TestClass() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");

		// import the base class at LoginPage

		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		
		HomepageActitime home = new HomepageActitime(driver);
		home.clickOnTask();
		
		TaskPageOfActitime task= TaskPageOfActitime(driver);
		task.clickOnAddNewButton();
		task.clickOnNewCustomer();
		
		CreateNewCustomerPageActitime cust = new CreateNewCustomerPageActitime(driver);
		cust.createCustomer("TestYantra", "Noida");
		
		


		

	}

	private TaskPageOfActitime TaskPageOfActitime(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
