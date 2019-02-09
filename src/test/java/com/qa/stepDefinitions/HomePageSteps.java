package com.qa.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends TestBase{
	
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
