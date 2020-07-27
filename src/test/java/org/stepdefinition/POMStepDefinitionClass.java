package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.pojo.LoginPOJOClass;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMStepDefinitionClass extends BaseClass {
	
@Given("user has to be there in fb page")
public void user_has_to_be_there_in_fb_page() {
	
	loadURL("https://www.facebook.com/");
}

@When("user has to fill username and password")
public void user_has_to_fill_username_and_password(io.cucumber.datatable.DataTable d) {
	
	List<Map<String, String>> mp = d.asMaps();
	LoginPOJOClass lp = new LoginPOJOClass();
	fill(lp.getTxtUserName(),mp.get(0).get("username"));
	fill(lp.getTxtPassWord(),mp.get(1).get("password"));
	
}

@When("user clicks the login button")
public void user_clicks_the_login_button() {
	LoginPOJOClass lp = new LoginPOJOClass();
	lp.getBtnLogin();
}

@Then("user navigate into homepage")
public void user_navigate_into_homepage() {
System.out.println("completed successfully");
}

@When("user has to fill invalid username and invalid password")
public void user_has_to_fill_invalid_username_and_invalid_password() throws IOException {
	LoginPOJOClass l = new LoginPOJOClass();
	fill(l.getTxtUserName(),getData(1,0));
	fill(l.getTxtPassWord(),getData(1,1));
	l.getBtnLogin();
}

@Then("user should not able to navigate the homepage")
public void user_should_not_able_to_navigate_the_homepage() {
System.out.println("User given invalid username and password");
}

}
