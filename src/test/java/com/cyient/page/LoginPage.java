package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	
	private By loginLocator = By.xpath("//a[@title='My Profile']//span[@class='hnf-btn__inner']");
	private By signupLocator = By.xpath("//button[@id='signup']");
	private By firstnameLocator = By.id("family-signup-form-firstName");
	private By surnameLocator=By.id("family-signup-form-lastName");
	private By mobileLocator=By.xpath("//input[@id='family-signup-form-mobile']");
	//private By loginLocator = By.xpath("//button[@type='submit']");
	private By dobLocator = By.xpath("//input[@id='family-signup-form-birthDate']");
	private By genderLocator = By.xpath("//option[@id='family-signup-form-genderCode-0']");
	//family-signup-form-genderCode-0 path for male
	private By postcodelocator = By.id("family-signup-form-zipCode");
	private By prefstorelocator = By.xpath("//option[@id='family-signup-form-preferredStore-0']");
	private By emaillocator = By.id("family-signup-form-username");
	
	private By passwordLocator=By.id("family-signup-form-password");
	private By createprofileLocator = By.xpath("//span[contains(text(),'Create profile')]");
	
	private By errorLocator=By.xpath("//span[contains(text(),'You must have read and accepted the Terms & Condit')]");
	private WebDriver driver;

	public LoginPage(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		Thread.sleep(3000);
	}
	
	public void clickOnLogin() throws InterruptedException
	{ Thread.sleep(1000);
		driver.findElement(loginLocator).click();
	}
	
	public void clickOnSignup() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(signupLocator).click();
	}

	public void sendFirstrname(String firstname) {
		driver.findElement(firstnameLocator).sendKeys(firstname);
	}
	
	public void sendSurrname(String surname) {
		driver.findElement(surnameLocator).sendKeys(surname);
	}
	
	public void sendMobile(String mobile) {
		driver.findElement(mobileLocator).sendKeys(mobile);
	}
	public void sendDob(String dob) {
		driver.findElement(dobLocator).sendKeys(dob);
	}
	
	public void selectGenderByText(String GenderText) {
		Select selectGender = new Select(driver.findElement(genderLocator));
	selectGender.selectByValue("2");
	
	}
	
	
	public void sendPostCode(String postcode) {
		driver.findElement(dobLocator).sendKeys(postcode);
	}
	

	public void selectpfStoreByText(String StoreText) {
		Select selectGender = new Select(driver.findElement(prefstorelocator));
	selectGender.selectByVisibleText(StoreText);
	}
	
	public void sendEmail(String email) {
		driver.findElement(emaillocator).sendKeys(email);
	}
	
	public void sendPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public void createprofileclick () {
		driver.findElement(createprofileLocator).click();
	}
	public String getErrorMessage()
	{
	return driver.findElement(errorLocator).getText().trim();
	}
}



