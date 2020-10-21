package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class LinkedInSignInPage extends TestBase {

	@FindBy(xpath = "//*[@class='nav__button-secondary' and text()='Sign in' ]")
	WebElement signIn;

	@FindBy(xpath = "//*[@id = 'username']")
	WebElement username;

	@FindBy(xpath = "//*[@id = 'password']")
	WebElement password;

	@FindBy(xpath = "//*[text()= 'Sign in']")
	WebElement signInBtn;

	@FindBy(xpath = "//*[@role='combobox' and @class ='search-global-typeahead__input always-show-placeholder']")
	WebElement searchBox;
	
	@FindBy(xpath="//*[contains(@class, 'message-anywhere-button')]")
	WebElement message;
	
	@FindBy(xpath = "//*[@aria-label='Write a message…']")
	WebElement sendMessageToUser;
	
	@FindBy(xpath = "//*[contains(@class, 'msg-overlay-bubble-header') and @data-control-name='overlay.minimize_conversation_window_bar']")
	WebElement CollapseMessagePopUp;
	
	@FindBy(xpath = "//*[@data-control-name='nav.settings']")
	WebElement userIcon;
	
	@FindBy(xpath = "//*[text()= 'Sign Out']")
	WebElement signOutBtn;

	public LinkedInSignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSignButton() {
		signIn.click();
	}

	public void login() throws InterruptedException {

		String name = prop.getProperty("username");
		String psw = prop.getProperty("password");

		username.sendKeys(name);
		password.sendKeys(psw);

		// signInBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", signInBtn);
		driver.navigate().to("https://www.linkedin.com/feed");
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();

	}

	public void searchUser() {
		searchBox.click();
		searchBox.sendKeys(prop.getProperty("user"));
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void messageUser() {
		message.click();
		sendMessageToUser.click();
		
		String message = prop.getProperty("messageBody");
		sendMessageToUser.sendKeys(message);
		sendMessageToUser.sendKeys(Keys.ENTER);
		CollapseMessagePopUp.click();
		

	}

	public void logout() throws InterruptedException {
		
		userIcon.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", signOutBtn);
		
		//signOutBtn.click();
		driver.quit();
		
		
		
		
	}
}
