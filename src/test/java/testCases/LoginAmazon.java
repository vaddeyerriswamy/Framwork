package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAmazon {
		@Test(invocationCount = 10,threadPoolSize = 2)
		public void LoginAmazons() {
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();//base
			driver.manage().window().maximize();//base
			driver.get("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&hvadid=590652406969&hvdev=c&hvlocphy=9062140&hvnetw=g&hvqmt=e&hvrand=1228483478718693147&hvtargid=kwd-837441119212&hydadcr=24542_2265395&mcid=21027f31522b357794b2e3ec13f3c9f7&tag=googinhydr1-21&ref=pd_sl_2cwzc6x246_e");//properties file
			driver.close();
		}
}
