package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	
	public static void generateReport(String jsonFile) {
			
		//To configure the jvm report
	
		Configuration con = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"), "xyz");
		
		//To add classification details
		
		con.addClassifications("AppName", "Facebook");
		con.addClassifications("Author", "ravi");
		con.addClassifications("Username", "DefectLog");
		con.addClassifications("ScenarioOutline", "MultipleDatas");
		
		
		List<String>jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		
		//To generate the JVM report
		ReportBuilder builder = new ReportBuilder (jsonFiles, con);
		builder.generateReports();
		
		
	}

	
}
