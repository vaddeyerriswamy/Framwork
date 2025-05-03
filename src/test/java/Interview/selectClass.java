package Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		WebElement month=driver.findElement(By.xpath("//*[@name=\"birthday_month\"]"));
		int name=driver.findElement(By.xpath("//*[text()='Female']")).getSize().getHeight();
		System.out.println(name);
		Select drop= new Select(month);
		List<WebElement>  d=drop.getOptions();
		for(int i=0;i<d.size();i++) {
			if(d.get(i).getText().equalsIgnoreCase("Dec")) {
				d.get(i).click();
				break;	
			}
		}
}
}
