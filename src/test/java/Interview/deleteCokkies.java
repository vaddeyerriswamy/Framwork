 package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deleteCokkies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("abced");
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_asc");
	}

}
