package com.cyient.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.LoginPage;
import com.cyient.page.ProductCartPage;

public class ProductCartTest extends WebDriverWrapper  {
@Test
	public void cartTest() throws InterruptedException {
		ProductCartPage pdCart = new ProductCartPage(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		pdCart.OllOfferClick();
		pdCart.FirstProductSelect();
		pdCart.AddToCart();
		pdCart.ContiueToCart();
		pdCart.QuantChange();
		pdCart.DeleteProduct();}
		//pdCart.getMessage();
			
		public void cartVaidateTest() throws InterruptedException {
			
				String actualDescription = driver.findElement(By.xpath("//p[normalize-space()='Your cart is empty!']")).getText();
				Assert.assertEquals(actualDescription, "Your cart is empty!");
		Thread.sleep(4000);
	}
	
}
