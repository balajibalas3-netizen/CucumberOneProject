package com.omrbranchlogin.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reportomrbranch.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
dryRun = false ,publish = true ,monochrome = true ,plugin = {"pretty","json:target1\\ouput.json"} ,name = {"Verifying instagram credentials"},glue="com.omrbranchlogin.stepdefinition" 
,features="src\\test\\resources\\features1")


public class OmrBranchTestRunner {
	
	@AfterClass
	
	public static void afterClass() {
		Reporting
		.generateJVMReport("C:\\Users\\User\\eclipse-workspaceFW\\Cucumberonne\\target1\\jvmReport.json");
	}
	
	
	
	
}
