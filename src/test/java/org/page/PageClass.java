package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageClass extends BaseClass{
	
	public PageClass() {
		
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(how = How.NAME, using ="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(how = How.XPATH, using ="//input[@class='button']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(how = How.XPATH,using = "//a[@href='/parabank/billpay.htm']")
	private WebElement Billpay;

	public WebElement getBillpay() {
		return Billpay;
	}
	
	@FindBy(how = How.NAME, using = "payee.name")
	private WebElement payeename;

	public WebElement getPayeename() {
		return payeename;
	}
	
	@FindBy(how = How.NAME, using = "payee.address.street")
	private WebElement payeeAddress;

	public WebElement getPayeeAddress() {
		return payeeAddress;
	}
	
}
