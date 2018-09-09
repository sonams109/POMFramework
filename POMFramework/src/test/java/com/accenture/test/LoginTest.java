package com.accenture.test;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.LoginPage;
import com.accenture.pages.RegisterPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	WebDriver driver;
	HomePage h;
	LoginPage LP;
	RegisterPage R;
  @Test
  public void testLogin() {
	  driver.get("http://demowebshop.tricentis.com/");
	  h.ClickLogin();
	  LP.ClickLoginButton("Myemail@gmail.com","abcoooq");
	  R.Resgister();
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc2b-training.pdc2b\\eclipse-workspace\\SeleniumAdvance\\src\\test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		h=PageFactory.initElements(driver, HomePage.class);
		LP=PageFactory.initElements(driver, LoginPage.class);
		R=PageFactory.initElements(driver, RegisterPage.class);
	}

}
