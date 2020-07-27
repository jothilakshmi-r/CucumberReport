package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	@Before
	public void beforemethod() throws InterruptedException {
	System.out.println("Before Method will execute initially");
	launchBrowser();
	Thread.sleep(3000);
	
	}
	
	@Before("@Regression")
	public void beforeExecutionofGroup2() {
		System.out.println("Before Regression");
		driver.manage().window().maximize();

	}
	@Before("@Sanity")
	public void beforeExecutionofGroup3() {
		System.out.println("Before Sanity");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	@After
	public void afterMethod() {
		System.out.println("After Method executed closing the browser");
		driver.quit();

	}

}
