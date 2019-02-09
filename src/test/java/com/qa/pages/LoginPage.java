package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class LoginPage extends TestBase{
	
	//public WebDriver driver;
	
	//Page Factory - OR:
	@FindBy(css="input#email.inputtext")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement loginBtn;
	
	@FindBy(partialLinkText="https://www.facebook.com/karthikai.selvan.37?ref=bookmarks")
	WebElement link;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		//this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
		
	public boolean validateusername(){
		return link.isDisplayed();
	}
	
	String b=prop.getProperty("username");
	String p=prop.getProperty("password");
	public void login(){
		username.sendKeys(b);
		password.sendKeys(p);
		//loginBtn.click();
		  //  	JavascriptExecutor js = (JavascriptExecutor)driver;
		  //  	js.executeScript("arguments[0].click();", loginBtn);
		    	
		//return new HomePage();
	} 
	/*
	public void login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		  //  	JavascriptExecutor js = (JavascriptExecutor)driver;
		  //  	js.executeScript("arguments[0].click();", loginBtn);
		    	
		//return new HomePage();
	} */
	public void clickLogin(){

		loginBtn.click();
    }


}