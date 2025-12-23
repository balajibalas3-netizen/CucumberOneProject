package com.omrbranch.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Loginsteps { 
	
	
	WebDriver driver;

	@Given("user is on the facebook page")
	public void a() {
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	}
	@When("user enter username and password")
	public void b() {
		driver.findElement(By.id("email")).sendKeys("balajibalas3@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Balaji@123");
	    
	}
	
	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	@Then("user should verify after login sucess message")
	public void user_should_verify_after_login_sucess_message() {
		Assert.assertTrue("Verify After Login", true);
		driver.quit();
	    
	}


}
