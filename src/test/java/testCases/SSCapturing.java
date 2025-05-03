package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSCapturing {
	private TakesScreenshot driver;

	public void captureSS(String filename) throws IOException {
		TakesScreenshot Take=(TakesScreenshot)driver;
		File src=Take.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./Screenshots"+filename);
		try {
			FileUtils.copyFile(src, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ScreenShot saved successfully");
	}
	
	
	@Test(testName="LoginFacebook")
	public void LoginFacebook() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"emails\"]")).sendKeys("8121170566");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("6304462453");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		driver.close();
	
	}
	@Test(testName="LoginFacebooks")
	public void LoginFacebooks() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();//base
		driver.manage().window().maximize();//base
		driver.get("https://www.youtube.com/watch?v=S5wJYCHrUQ4&t=2391s");//properties file
		driver.close();
	}
	
	@Test(testName="LoginFacebookss")
	public void LoginFacebookss() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html");
		driver.close();
	}
}
