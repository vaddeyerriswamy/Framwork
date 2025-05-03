package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {
		@Test(priority = -1)
		public void A() {
			System.out.println("Test -1");
		}
		@Test(priority = -2)
		public void A1() {
			System.out.println("Test -2");
		}
		@Test(priority = 0)
		public void A2() {
			System.out.println("Test -3");
		}
		@Test
		public void A3() {
			System.out.println("Test -4");
		}
		@BeforeTest
		public void A4() {
			System.out.println("Test -5");
		}
}
