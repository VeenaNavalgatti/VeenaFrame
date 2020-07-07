package com.clearcode.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.AllProperty;
import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;
import com.clearcode.po.Regions;

import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{

	@Test(dataProvider="propertyDetail",dataProviderClass=LoginData.class)
	public void propertyDetail(String user, String pwd, String title, String name, String Slug,String Desciption, String Title,String TextBox) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		wdu.type(HomePage.username_ip, user);
		wdu.type(HomePage.pwd_ip, pwd);
		wdu.click(HomePage.login_btn);
		
		
		wdu.mouseOver(AllProperty.all_Properties);
		wdu.click(AllProperty.allProperties);
		
		wdu.click(Regions.regions);
		wdu.selectByVisibleText(Regions.regionTitle, title);
		
		wdu.type(Regions.Name, name);
		wdu.type(Regions.Slug, Slug);
		wdu.selectByValue(Regions.parentRegionDpDw, "");
		wdu.type(Regions.Description, Desciption);
		wdu.click(Regions.sub);
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		wdu.click(Regions.addNewlink);
		wdu.type(Regions.title, Title);
		wdu.type(Regions.content, TextBox);
		wdu.click(Regions.regionCkBx);
		
		wdu.click(Regions.publish);
		
		
		
		
		
				
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, title);
//		wdu.type(PatientPage.fname_ip, fname);
//		wdu.type(PatientPage.lname_ip, lname);
	}
	
}
