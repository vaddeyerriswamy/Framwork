package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLdata;

public class myFirstTestw extends BaseTest{
		@Test(dataProviderClass = ReadXLdata.class,dataProvider = "bvtData")
		public static void loginTest(String usrename,String password) throws InterruptedException {
			driver.findElement(By.xpath(loc.getProperty("email_id"))).sendKeys(usrename);
			driver.findElement(By.xpath(loc.getProperty("Password_Field"))).sendKeys(password);
			driver.findElement(By.xpath(loc.getProperty("login_button"))).click();
			Thread.sleep(1000);
		}
//		
//		@DataProvider(name="testdata")
//		public Object[][] tData()
//		{
//			return new Object[][] 
//			{
//				{"8121170566","6304462453"},
//				{"8121170566","6304462453"},
//				{"8121170566","6304462453"},
//				{"8121170566","6304462453"}
//			};
//		}
		
}
