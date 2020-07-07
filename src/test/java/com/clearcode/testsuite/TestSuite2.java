package com.clearcode.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.AllProperty;
import com.clearcode.po.HomePage;

import com.clearcode.po.Regions;
import com.clearcode.po.addProperty;

import dataProvider.LoginData;

public class TestSuite2 extends TestSetup{

	@Test(dataProvider="addProperty",dataProviderClass=LoginData.class)
	public void addProperty(String user, String pwd, String poss,String Title, String price, String log, String storeroom,String Latitude, String Address,String map, String pricepersq,String Status, String Title1,String TextBox,String Location) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		wdu.type(HomePage.username_ip, user);
		wdu.type(HomePage.pwd_ip, pwd);
		wdu.click(HomePage.login_btn);
		
		
		wdu.mouseOver(AllProperty.all_Properties);
		wdu.click(AllProperty.allProperties);
		
		wdu.click(addProperty.addnewlink);
		wdu.type(addProperty.title, Title1);
		wdu.type(addProperty.content, TextBox);
		wdu.type(addProperty.price, price);
		wdu.type(addProperty.priceperqf, pricepersq);
		wdu.click(addProperty.mainDetails);
		wdu.type(addProperty.status,Status);
		wdu.type(addProperty.location, Location);
		wdu.type(addProperty.possession, poss);
		
		wdu.click(addProperty.Loc);
		wdu.type(addProperty.Address, Address);
		wdu.type(addProperty.GoogleMapAdd, map);
		wdu.type(addProperty.Latitude, Latitude);
		wdu.type(addProperty.logitude, log);
		wdu.click(addProperty.details);
		wdu.type(addProperty.storeroom, storeroom);
		wdu.click(addProperty.regionCkbox);
		wdu.click(addProperty.Feature);
		wdu.click(addProperty.RegionCkBox);
		
		
		//driver.findElement(By.id("content")).sendKeys("flat");
		
		//to enter price
		//driver.findElement(By.id("_price")).sendKeys("90000");
		
		
		//driver.findElement(By.id("_price_per")).sendKeys("3000");
		
		// Click on Main Details tab
		
		//driver.findElement(By.partialLinkText("Main Details")).click();
		
		// Enter valid credentials in Status textbox
		//driver.findElement(By.id("_status")).sendKeys("New");
		
		// Enter valid credentials in Location textbox
		//driver.findElement(By.id("_location")).sendKeys("Kormangala");
		
		// Enter valid credentials in Possession textbox
		//driver.findElement(By.id("_possession")).sendKeys("ready to occupy");
		
		// Click on Location tab
		//driver.findElement(By.partialLinkText("Location")).click();
		
		// Enter valid credentials in Address textbox
		//driver.findElement(By.id("_friendly_address")).sendKeys("Kormangala");
		
		// Enter valid credentials in Google Maps Address textbox
		//driver.findElement(By.xpath("//*[@id=\"_address\"]")).sendKeys("Kormangala");
		
		// Enter valid credentials in Latitude textbox
		//driver.findElement(By.id("_geolocation_lat")).sendKeys("120");
		
		// Enter valid credentials in Longitude textbox
		
		//driver.findElement(By.id("_geolocation_long")).sendKeys("12");
		
		// Click on Details tab

		
		//driver.findElement(By.id("ui-id-4")).click();
		
		// Enter valid credentials in Storage Room textbox

		//driver.findElement(By.id("_storage_room")).sendKeys("2");
		
		// Click on Central Bangalore Checkbox
		
		// driver.findElement(By.id("in-region-1348")).click();
		//driver.findElement(By.xpath("//*[@id=\"in-region-1348\"]")).click();
		
		
//		WebElement element = driver.findElement(By.id("in-region-1348"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
		
		// Click on checkbox beside  Feature of Features section
		//driver.findElement(By.id("in-property_feature-1366")).click();
		
		// Click on checkbox beside  Region of Regions section
		//WebElement ele = driver.findElement(By.id("in-region-1352"));
//		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//		executor1.executeScript("arguments[0].click();", ele);
//		
		
		//driver.findElement(By.id("in-region-1352")).isSelected();
//		driver.findElement(By.id("publish")).submit();
//		
//		
//		
//		Thread.sleep(4000);
//		
//		driver.navigate().refresh();
		
		
		
		
		
		
		
		
	}
	
}
