package com.timeKeeping.actitime;

import org.testng.annotations.Test;

public class GroupMavenTest {
	@Test(groups = "smoke")
	public void demo1() {
		System.out.println("demo1");
	}
	
	@Test(groups = "smoke")
		
		public void demo2() {
			System.out.println("demo2");
			
	}
	
	@Test(groups = "regression")
			
			public void demo3() {
				System.out.println("demo3");
				
	}
	
	@Test(groups = "regression")
				
				
				public void demo4() {
					System.out.println("demo4");
	}
					
					

}
