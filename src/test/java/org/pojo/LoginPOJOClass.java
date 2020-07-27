package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJOClass extends BaseClass{
	public LoginPOJOClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(id="pass")
	private WebElement txtPassWord;
	
	@FindBy(id="loginbutton")
	private WebElement btnLogin;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}


	
	

}
