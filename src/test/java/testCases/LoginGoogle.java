package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginGoogle {
	@Test
	public void googleLogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();//base
		driver.manage().window().maximize();//base
		driver.get("https://www.google.com/");//properties file
		driver.close();
	}

}
