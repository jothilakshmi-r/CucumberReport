package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition", dryRun=false,plugin={"html:C:\\Users\\SHYAMSUNDAR\\workspace\\POM\\src\\test\\resources\\Reports","json:C:\\Users\\SHYAMSUNDAR\\workspace\\POM\\src\\test\\resources\\Reports\\output.json"})
public class TestRunnerClass {
	
	@AfterClass
	public static void jvmReportGeneration()
	{
		JVMReport.generateJvmReport("C:\\Users\\SHYAMSUNDAR\\workspace\\POM\\src\\test\\resources\\Reports\\output.json");
	}
}
