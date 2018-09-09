package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver d;
	@FindBy(name="Email")
	static WebElement Email;
	@FindBy(name="Password")
	static WebElement Password;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	static WebElement LoginButton;
	
	public void ClickLoginButton(String u,String P)
	{
		Email.sendKeys(u);
		Password.sendKeys(P);
		LoginButton.click();
		
}
}
