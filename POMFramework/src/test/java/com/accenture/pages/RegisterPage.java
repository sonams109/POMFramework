package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	WebDriver d;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input")
	static WebElement Register;
	@FindBy(id="gender-female")
	static WebElement Gender;
	@FindBy(name="FirstName")
	static WebElement Firstname;
	@FindBy(name="LastName")
	static WebElement LastName;
	@FindBy(name="Email")
	static WebElement Email;
	@FindBy(name="Password")
	static WebElement Password;
	@FindBy(id="ConfirmPassword")
	static WebElement ConfirmPassword;
	@FindBy(id="register-button")
	static WebElement registerbutton;
	
	public void Resgister() {
		Register.click();
		Gender.click();
		Firstname.sendKeys("Sonam");
		LastName.sendKeys("Shinde");
		Email.sendKeys("sonams109@gmail.com");
		Password.sendKeys("Accenture123");
		ConfirmPassword.sendKeys("Accenture123");
		registerbutton.click();
		
	}
}
