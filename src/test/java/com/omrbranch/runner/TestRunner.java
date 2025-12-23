package com.omrbranch.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE  ,
 dryRun = false ,publish = true ,monochrome = true 
,plugin = {"pretty","junit:target\\output.xml"}
,name = {"Amazon Product page"},glue="com.omrbranch.stepdefinition" 
,features ="src\\test\\resources\\features")


public class TestRunner  {
	public static void main(String[] args) {
		System.out.println("Hello Amalnath");

		
		
		System.out.println("Hello Rohith shirvan 45");

		
	}
	

}
// "json:target\\output.json"
// "html:target\\output.html"
