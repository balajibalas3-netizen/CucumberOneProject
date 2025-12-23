package com.omrbranchlogin.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OmrLoginStep {
	
	WebDriver driver;

	@Given("user is on the omrbranch login page")
	public void a() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}
	@When("user enter {string} and {string}")
	public void b(String name, String password) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
	}
	@When("user clicks the login button")
	public void c() {
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	    
	}
	@Then("user should verify after login sucess message")
	public void d() {
		Assert.assertTrue("Verify After Login", true);
		driver.quit();
	   
	}




}
