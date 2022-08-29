package com.timeKeeping.actitime;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	@Parameters("browser")
	@Test
	
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			new ChromeDriver();
		}
			
			System.out.println("Class");
			
			Reporter.log("Report message", true);
			
	}

	
	
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
			
		
	}

}
