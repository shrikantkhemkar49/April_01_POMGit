package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy (name="username")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (xpath = "//button[text()=' Login ']")
	WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginFunctionality(String userName, String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginButton.click();
	}

}
