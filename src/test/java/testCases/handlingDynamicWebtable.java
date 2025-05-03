package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingDynamicWebtable {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
//			driver.get("https://practice.expandtesting.com/dynamic-table");
//			driver.get("https://www.cricbuzz.com/cricket-series/7607/indian-premier-league-2024/points-table");
//			List<WebElement> rows=	driver.findElements(By.xpath("//table[@class=\"table cb-srs-pnts\"]/tbody/tr"));
//			System.out.println(rows.size());
//			
//			for(int r=1;r<rows.size();r++) {
//			WebElement elementNames=driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']/tbody/tr["+r+"]/td[1]"));
//			System.out.println(elementNames.getText());	
//			}
			driver.get("https://practice.expandtesting.com/dynamic-table");
			List<WebElement> rows=	driver.findElements(By.xpath("//*[@class=\"table-responsive\"]//tbody/tr"));
			System.out.println(rows.size());
				
			for(int r=1;r<rows.size();r++) {
				WebElement elementNames=driver.findElement(By.xpath("//*[@class='table-responsive']//tbody/tr["+r+"]/td[1]"));
				if(elementNames.getText().equals("Chrome")) {
//					driver.findElement(By.xpath("//td[normalize-space()='Chrome']"));
					String cpuLoad=	driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
					String ActualLoad=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();

					if(ActualLoad.contains(cpuLoad)) {
						System.out.println("CPU load of Chrome is equal");
					}else {
						System.out.println("Cpu Load of chrome is not equal");
					}
					break;
				}
			}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
