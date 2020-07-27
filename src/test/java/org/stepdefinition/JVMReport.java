package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JVMReport {
	
	public static void generateJvmReport(String json){
	
	File f = new File("C:\\Users\\SHYAMSUNDAR\\workspace\\POM\\target\\JVMReport");
	
	Configuration con = new Configuration(f,"FaceBook App");
	con.addClassifications("Platform Name", "Windows 8");
	con.addClassifications("Browser Name", "Chrome");
	con.addClassifications("Sprint", "20");
	
	List<String> li = new ArrayList<String>();
	li.add(json);
	
	ReportBuilder r = new ReportBuilder(li,con);
	r.generateReports();
	
	}
	

}
