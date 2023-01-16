package com.test.methods;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class SubscriptionTest{
	
	ChromeDriver driver = new ChromeDriver();
	
	String typeLite;
	String typeClassic;
	String typePremium;
	double priceLite, priceClassic, pricePremium;
	String currencyType;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}

	
	@Test(priority=1)
	public void verifyTestSA() {
		
		driver.get("https://subscribe.stctv.com/sa-en");
		String typeLite = driver.findElement(By.xpath("//h1[normalize-space()='Lite']")).getText();
		Assert.assertEquals(typeLite, "LITE");
		String typeClassic = driver.findElement(By.xpath("//h1[normalize-space()='Classic']")).getText();
		Assert.assertEquals(typeClassic, "CLASSIC");
		String typePremium = driver.findElement(By.xpath("//h1[normalize-space()='Premium']")).getText();
		Assert.assertEquals(typePremium, "PREMIUM");
		String priceLite = driver.findElement(By.xpath("//span[normalize-space()='15']")).getAttribute("textContent");
		Assert.assertEquals(priceLite, "15");
		
		String priceClassic = driver.findElement(By.xpath("//span[normalize-space()='25']")).getText();
		Assert.assertEquals(priceClassic, "25");
		
	
		String pricePremium = driver.findElement(By.xpath("//span[normalize-space()='60']")).getText();
		Assert.assertEquals(pricePremium, "60");
		
		String currencyType = driver.findElement(By.xpath("//div[@class='packages packages Light']//span[@class='currency'][normalize-space()='SAR']")).getText();
		Assert.assertEquals(currencyType, "SAR");
		
	}
	
	@Test(priority=2)
	public void verifyTestKW() {
		
		driver.get("https://subscribe.stctv.com/kw-en");
		String typeLite = driver.findElement(By.xpath("//h1[normalize-space()='Lite']")).getText();
		Assert.assertEquals(typeLite, "LITE");
		String typeClassic = driver.findElement(By.xpath("//h1[normalize-space()='Classic']")).getText();
		Assert.assertEquals(typeClassic, "CLASSIC");
		String typePremium = driver.findElement(By.xpath("//h1[normalize-space()='Premium']")).getText();
		Assert.assertEquals(typePremium, "PREMIUM");
		String priceLite = driver.findElement(By.xpath("//span[normalize-space()='15']")).getAttribute("textContent");
		Assert.assertEquals(priceLite, "1.2");
		
		String priceClassic = driver.findElement(By.xpath("//span[normalize-space()='25']")).getText();
		Assert.assertEquals(priceClassic, "2.5");
		
	
		String pricePremium = driver.findElement(By.xpath("//span[normalize-space()='60']")).getText();
		Assert.assertEquals(pricePremium, "4.8");
		
		String currencyType = driver.findElement(By.xpath("//div[@class='packages packages Light']//span[@class='currency'][normalize-space()='SAR']")).getText();
		Assert.assertEquals(currencyType, "KWD");
		
	}
	
	
	@Test(priority=2)	
	public void verifyTestBH() {
		driver.get("https://subscribe.stctv.com/bh-en");
		String typeLite = driver.findElement(By.xpath("//h1[normalize-space()='Lite']")).getText();
		Assert.assertEquals(typeLite, "LITE");
		String typeClassic = driver.findElement(By.xpath("//h1[normalize-space()='Classic']")).getText();
		Assert.assertEquals(typeClassic, "CLASSIC");
		String typePremium = driver.findElement(By.xpath("//h1[normalize-space()='Premium']")).getText();
		Assert.assertEquals(typePremium, "PREMIUM");
		String priceLite = driver.findElement(By.xpath("//span[normalize-space()='2']")).getAttribute("textContent");
		Assert.assertEquals(priceLite, "2");
		
		String priceClassic = driver.findElement(By.xpath("//span[normalize-space()='3']")).getText();
		Assert.assertEquals(priceClassic, "3");
		
	
		String pricePremium = driver.findElement(By.xpath("//span[normalize-space()='6']")).getText();
		Assert.assertEquals(pricePremium, "6");
		
		String currencyType = driver.findElement(By.xpath("//div[@class='packages packages Light']//span[@class='currency'][normalize-space()='BAH']")).getText();
		Assert.assertEquals(currencyType, "BAH");
		
		
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
