package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myFirstTestCase {
	@Test
		public static void A() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();//base
			driver.manage().window().maximize();//base
			driver.get("https://www.facebook.com/");//properties file
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8121170566");//locators --properties
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("6304462453");
			driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
			driver.close();
			
		}
}
