package com.timeKeeping.actitime.genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	@BeforeSuite

	public void bsConfig() {

		System.out.println("=============DataBase Connection is Esteblished===============");

	}

	@BeforeClass

	public void bmConfig() {
		System.out.println("==================Browser is Launched========================");
		System.out.println("==============Navigate to URL============================");

	}

	@BeforeMethod

	public void b1Config() {

		System.out.println("=====================Logged into the Application==================");

	}

	@AfterMethod

	public void b2Config() {

		System.out.println("=====================Logged Out the Application==================");

	}
	@AfterClass

	public void b3Config() {

		System.out.println("=====================Close The Browser ==================");

	}
	
	@AfterSuite
	
	public void b4Config() {

		System.out.println("=====================Close The Database ==================");

	}
	
	

}
