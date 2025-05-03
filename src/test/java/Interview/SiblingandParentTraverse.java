package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiblingandParentTraverse {
		public static void main(String[] args) {
		//Sibling to Siblinh and child to Parent
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			//header/div/button[2]--->Parent to Child
			////header/div/button[1]/following-sibling::button[1]--->Parent to child and Sibling to sibling
			String str=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
			System.out.println(str);
			
			//header/div/button[1]/parent::div/parent::header/a --Child to Parent sibling concept
			
			System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
