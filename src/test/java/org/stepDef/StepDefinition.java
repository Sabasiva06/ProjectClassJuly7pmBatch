package org.stepDef;

import org.base.BaseClass;
import org.locator.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	LoginPage a;
	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
		getDriver();
		launchUrl("https://www.facebook.com/");
		
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
		 a = new LoginPage();
		 WebElement txtUserName = a.getTxtUserName();
		 enterText(txtUserName, string);
		 WebElement txtPassword = a.getTxtPassword();
		 enterText(txtPassword, string2);
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin = a.getBtnLogin();
		btnClick(btnLogin);
	}

	@Then("User should validate login page displayed or not")
	public void user_should_validate_login_page_displayed_or_not() {
	   System.out.println("invalid login");
	}


}
