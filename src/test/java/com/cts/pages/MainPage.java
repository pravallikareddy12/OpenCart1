package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class MainPage {
	private static WebDriver driver;
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	public static void clickOnDesktops()
	{
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
	}
	
	
	public static void clickOnseeall()
	{
		Actions actions =new Actions(driver);
	     actions.moveToElement(driver.findElement(By.xpath("//a[@class='see-all']"))).pause(1000).doubleClick().build().perform();
	}
	
	public static String getDesktopTitle()
	{
		String actualTitle=driver.findElement(By.linkText("Desktops")).getText();
		return actualTitle;
	}
	
	
	
	public static void clickOnLaptopsandNotebooks()
	{
		driver.findElement(By.linkText("Laptops & Notebooks")).click();
	}
	

	public static void clickOnShowAll()
	{
		Actions actions =new Actions(driver);
	     actions.moveToElement(driver.findElement(By.linkText("Show All Laptops & Notebooks"))).pause(1000).doubleClick().build().perform();
	}
	
	public static String getLaptopTitle()
	{
		String actualTitle=driver.findElement(By.xpath("//h2[text()='Laptops & Notebooks']")).getText();
		return actualTitle;
	}
	
	
	public static void clickOnComponents()
	{
		driver.findElement(By.linkText("Components")).click();
	}
	
	
	public static void clickOnMonitors()
	{
		Actions actions =new Actions(driver);
	     actions.moveToElement(driver.findElement(By.linkText("Monitors (2)"))).pause(1000).doubleClick().build().perform();
	}

	
	
	public static String getComponentsTitle()
	{
		String actualTitle=driver.findElement(By.xpath("//h2[text()='Monitors']")).getText();
		return actualTitle;
	}
	
	
	public static void clickOnTablets()
	{
		driver.findElement(By.linkText("Tablets")).click();
	}
	
	public static String getTabletsTitle()
	{
		String actualTitle=driver.findElement(By.xpath("//h2[text()='Tablets']")).getText();
		
		return actualTitle;
		
	}
	public static void clickOnAddtoCart() {
		driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")).click();
	}
	
	public static void ClickOnShoppingCart()

	{
		driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]")).click();
	}
	
	public static String getShoppingCartTitle()
	{
		String actualTitle=driver.findElement(By.linkText("Samsung Galaxy Tab 10.1")).getText();
		return actualTitle;
	}
	
}
