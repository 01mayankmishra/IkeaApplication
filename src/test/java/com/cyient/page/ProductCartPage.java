package com.cyient.page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductCartPage {
	private By allOfferLocator=By.xpath("//ul[@class='hnf-header__nav__main']//a[@class='hnf-link'][normalize-space()='All offers']");
	private By firstproducttLocator=By.xpath("//div[normalize-space()='ENEBY']");
	private By cartaddLocator=By.xpath("//button[@aria-label='Add to shopping cart']//span[@class='range-revamp-btn__inner']");
private By continuebagLocator= By.xpath("//span[normalize-space()='Continue to bag']");
private By editQuantLocator = By.xpath("//select[@id='js_qty_00401470']");	
private By deleteProductLocator = By.xpath("//img[@alt='Remove product']");
private By emptyMsgLocator = By.xpath("//p[normalize-space()='Your cart is empty!']");
private WebDriver driver;

	public ProductCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void OllOfferClick() throws InterruptedException
	{
			driver.findElement(allOfferLocator).click();
			Thread.sleep(1000);
		}
		
	public void FirstProductSelect()
	{
			driver.findElement(firstproducttLocator).click();
			
		}
	
	public void AddToCart()
	{
			driver.findElement(cartaddLocator).click();
			
		}
	public void ContiueToCart()
	{
			driver.findElement(continuebagLocator).click();
			
		}
	public void QuantChange() {
		Select selectquant = new Select(driver.findElement(editQuantLocator));
		selectquant.selectByValue("2");}
	
	public void DeleteProduct() {
		driver.findElement(deleteProductLocator).click();
		   driver.findElement(By.xpath("//span[normalize-space()='Remove']")).click();
	}
	
	public String getMessage()
	{
	return driver.findElement(emptyMsgLocator).getText().trim();
	}}
	
	
