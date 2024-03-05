package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTwo {

	@When("User click on Login")
	public void user_click_on_login() {

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userNmee, String password) {

		System.out.println(" UserNames: " + userNmee);
		System.out.println(" Password: " + password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {

	}

	@Then("User should be logged in to Grue99 dashboard")
	public void user_should_be_logged_in_to_grue99_dashboard() {

	}
	
	
	@Given("User opens the application")
	public void user_opens_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@When("Use enters username the belwo username and passwords")
	public void use_enters_username_the_belwo_username_and_passwords(io.cucumber.datatable.DataTable dataTable) {
	  
//		List<String>data = dataTable.row(0);
//		
//		for (String df: data) {
//			System.out.println(df);
//		}
		
		Map<String,String> dataMap = dataTable.asMap(String.class,String.class);
		
		for ( String key: dataMap.keySet()) {
			
			System.out.println(key );
		}
		
		
		List<String>data = dataTable.asList();
		
	   
	}
	@When("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User should be able to see the welcome text")
	public void user_should_be_able_to_see_the_welcome_text() {
	    
	}
	@Then("click on the log out button")
	public void click_on_the_log_out_button() {
	
	}
	@Then("User should be able clos ethe browser")
	public void user_should_be_able_clos_ethe_browser() {
	   
	}
	
	
}
