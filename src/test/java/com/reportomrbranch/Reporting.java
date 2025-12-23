package com.reportomrbranch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting {
	
	public static void generateJVMReport(String jsonFile) {
		
		String projectName = "Facebook Login Page";
		
		File file = new File("C:\\Users\\User\\eclipse-workspaceFW\\Cucumberonne\\target1\\output.json");
		
		Configuration configuration = new Configuration(file, projectName);
		
		configuration.addClassifications("os", "WINDOW 11");
		configuration.addClassifications("Browser Name", " Chrome");
		configuration.addClassifications("Version", "144");
		configuration.addClassifications("Sprint", "35");
		
		List <String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
		
		
	}

}
