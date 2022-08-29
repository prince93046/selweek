package com.timeKeeping.actitime;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DistributeParallelExecution {
	
	@Test
	public void demo1() {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		
		new ChromeDriver();
		System.out.println("demo1");
	}

}
