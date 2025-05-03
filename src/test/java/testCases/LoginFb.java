package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFb {
	@BeforeSuite
	public void LoginFacebook() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("C:\\Users\\Vyswa\\OneDrive\\Desktop"));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8121170566");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("6304462453");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		driver.close();
	}
	@Test
	public void LoginFacebooks() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();//base
		driver.manage().window().maximize();//base
		driver.get("https://www.facebook.com/");//properties file
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8121170566");//locators --properties
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("6304462453");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		driver.close();
	}
	
	@AfterSuite
	public void LoginFacebookss() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8121170566");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("6304462453");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		driver.close();
	}
	
	
}
