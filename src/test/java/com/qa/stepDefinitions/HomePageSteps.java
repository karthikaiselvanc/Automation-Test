package com.qa.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends TestBase{
	
/*
 * when we run the 'HomepageSteps' class first its calling the super class constuctor from TestBase ---1 st time
 * Because the HomePageSteps doesn't have default constructor and it calls the super class constructor
 * while creating the object for Login page class-> login page extends Testbase
 * so whenever the we create a object for login page it call the Test base constructor
 * we used three time so it calls - 3 time
 * 
 * 
 * 
 * 
 */
	
	
	
	
	//public WebDriver driver;
	
	//global object declare needed
	LoginPage loginpage;
	//LoginPage loginpage = new LoginPage();

	@Given("^I navigate to Facebook$")
	public void i_navigate_to_Facebook() {
	    // Write code here that turns the phrase above into concrete actions
		
      TestBase.initialization();
	}

	@When("^I put username and password$")
	public void i_put_username_and_password() {
	String ee =	prop.getProperty("username");
	System.out.println("prop value before executed" +ee);
	
		loginpage = new LoginPage();
		//loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginpage.login();
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() {
	    // Write code here that turns the phrase above into concrete actions
		//LoginPage loginpage = new LoginPage();
		loginpage = new LoginPage();
		loginpage.clickLogin();
	}

	//@SuppressWarnings("deprecation")
	@Then("^I should be on Home Page with Title$")
	public void i_should_be_on_Home_Page_with_Title() {
	    // Write code here that turns the phrase above into concrete actions
		//String titl = loginpage.validateLoginPageTitle();
        // Assert.assertEquals("Facebook", titl);
		loginpage = new LoginPage();
		loginpage.validateusername();
	}

}	
	
/*------------------------------------------------------------------	
	@Given("^I navigate to Facebook$")
	public void i_navigate_to_Facebook() {
		String ee =	prop.getProperty("username");
		System.out.println("prop value before executed" +ee);
	}

	@When("^I put username and password$")
	public void i_put_username_and_password() {

	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() {

	}

	//@SuppressWarnings("deprecation")
	@Then("^I should be on Home Page with Title$")
	public void i_should_be_on_Home_Page_with_Title() {

	}
	
 /*   public HomePageSteps() {
		
		System.out.println("first class");
	}  */
	
	
/*	-------------------------------------------------------  */ 
    

