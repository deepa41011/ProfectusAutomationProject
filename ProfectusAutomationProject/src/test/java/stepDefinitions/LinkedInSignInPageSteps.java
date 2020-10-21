package stepDefinitions;

import com.qa.base.TestBase;
import com.qa.pages.LinkedInSignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LinkedInSignInPageSteps extends TestBase {
	
	static LinkedInSignInPage signInPage;

	@Given("^user is on linkedin Home Page$")
	public void user_is_on_linkedin_Home_Page() throws Throwable {
		TestBase.initialization();
	}

	@When("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() throws Throwable {
		signInPage = new LinkedInSignInPage(driver);
		signInPage.clickSignButton();
	
	}
	
	@Then("^user enters credentials$")
	public void user_enters_credentials() throws InterruptedException {
		signInPage = new LinkedInSignInPage(driver);
		signInPage.login();

		
	}

	@Then("^user is logged in and on home page$")
	public void user_is_logged_in_and_on_home_page() throws Throwable {
		signInPage = new LinkedInSignInPage(driver);
		String Title = signInPage.verifyHomePageTitle();
		Assert.assertEquals(Title, "LinkedIn");
	}
	
	@Then("^user search for profectus kamaljeet$")
	public void user_search_for_profectus_kamaljeet() throws Throwable {
		signInPage = new LinkedInSignInPage(driver);
		signInPage.searchUser();
	   
	}

	@And("^user send message to contact$")
	public void user_send_message_to_contact() throws Throwable {
		signInPage = new LinkedInSignInPage(driver);
		signInPage.messageUser();
	    
	}
	
	@Then("^user Logout$")
	public void user_Logout() throws Throwable{
		signInPage = new LinkedInSignInPage(driver);
		signInPage.logout();
	}


}


