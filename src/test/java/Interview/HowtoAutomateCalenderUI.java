package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowtoAutomateCalenderUI {
	public static void main(String[] args) {
		String date="19/03/2025";
		String monthNumber="03";	
		String year="2025";
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		driver.findElement(By.xpath("//*[@class=\"calender-month-change\"]")).click();
		driver.findElement(By.xpath("//*[@value='"+date+"']")).click();
	}
}
