package com.cyient.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
//import com.cyient.page.DashboardPage;
import com.cyient.page.LoginPage;
import com.cyient.utilities.DataProviderUtils;
public class LoginTest extends WebDriverWrapper{
	

	@Test(dataProvider = "validCredentialExcelData",dataProviderClass = DataProviderUtils.class)
	public void validCredentialTest(String firstname,String surname,String mobile,String dob, String GenderText,String postcode, String StoreText,String email,String password) throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		//driver.findElement(By.xpath("//a[@title='My Profile']//span[@class='hnf-btn__inner']")).click();
		//driver.findElement(By.xpath("//button[@id='signup']"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		login.clickOnLogin();
	    login.clickOnSignup();
		login.sendFirstrname(firstname);
		login.sendSurrname(surname);
		login.sendMobile(mobile);
		login.sendDob(dob);
		login.selectGenderByText(GenderText);
		login.sendPostCode(postcode);
		login.selectpfStoreByText(StoreText);
		login.sendEmail(email);
		login.sendPassword(password);
		login.createprofileclick();
		//Thread.sleep(3000);
		String actualValue = login.getErrorMessage();
		String expectedValue = "You must have read and accepted the Terms & Conditions and Privacy Policy.";
		Assert.assertEquals(actualValue, expectedValue);
		Thread.sleep(5000);
	}}
//	@Test
//	public void validateUIComponentTest() {
//
//		String actualDescription = driver.findElement(By.xpath("//span[contains(text(),'You must have read and accepted the Terms & Condit')]")).getText();
//		Assert.assertEquals(actualDescription,
//				"You must have read and accepted the Terms & Conditions and Privacy Policy.");
//
//	}}
