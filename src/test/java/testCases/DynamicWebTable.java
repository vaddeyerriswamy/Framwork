package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id("email")).sendKeys("swamy");
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).clear();
		driver.findElement(By.name("pass")).sendKeys("vadde");
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("vadde");
		Thread.sleep(1000);
		driver.findElement(By.tagName("(//div/div/div/input)[4]")).sendKeys("vadde");//parent to Child
		driver.findElement(By.cssSelector("p._58mv")).getText();
	}
}
