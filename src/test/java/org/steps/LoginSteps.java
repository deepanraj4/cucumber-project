package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.PageClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends BaseClass {

	@Given("user need to enter the Username and Password")
	public void user_need_to_enter_the_username_and_password() {
		
		getDriver("Chrome");
		driver.get("https://parabank.parasoft.com/");
		
		PageClass l = new PageClass();
	
		WebElement username = l.getUsername();
		username.sendKeys("deepanraj4444");
		
		WebElement password = l.getPassword();
		password.sendKeys("12345678");
	   
	}

	@Then("user have to click the login button")
	public void user_have_to_click_the_login_button() {
		
		PageClass l = new PageClass();
		
		WebElement login = l.getLogin();
		login.click();
		
	}

	@Then("user verify the login successful")
	public void user_verify_the_login_successful() {
		
		System.out.println("user verify the login successful");
		
	}

	@Given("user clicking the bill pay option")
	public void user_clicking_the_bill_pay_option() {
	   
		PageClass l = new PageClass();
		WebElement Billpay = l.getBillpay();
		Billpay.click();
		
	}
	@Then("User needs to enter the Deepanraj and Velachery")
	public void user_needs_to_enter_the_deepanraj_and_velachery() {
		PageClass l = new PageClass();
	   WebElement payeeName = l.getPayeename();
	   payeeName.sendKeys("Deepanraj");
	   
	   WebElement payeeAdress = l.getPayeeAddress();
	   payeeAdress.sendKeys("Velachery");
		
	}
	@Then("user needs to enter the Chennai and TamilaNadu")
	public void user_needs_to_enter_the_chennai_and_tamila_nadu() {
		
		
		
	   
	}
	
}
