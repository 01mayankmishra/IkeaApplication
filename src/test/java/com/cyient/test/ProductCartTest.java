package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.LoginPage;
import com.cyient.page.ProductCartPage;

public class ProductCartTest extends WebDriverWrapper  {
@Test
	public void cartTest() {
		ProductCartPage pdCart = new ProductCartPage(driver);
		
		pdCart.FirstProductSelect();
		pdCart.AddToCart();
		pdCart.ContiueToCart();
		pdCart.QuantChange();
		pdCart.DeleteProduct();}
		//pdCart.getMessage();
			
		public void cartVaidateTest() {
			
				String actualDescription = driver.findElement(By.xpath("//p[normalize-space()='Your cart is empty!']")).getText();
				Assert.assertEquals(actualDescription, "Your cart is empty!");
		
	}
	
}
