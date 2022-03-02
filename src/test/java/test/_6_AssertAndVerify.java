package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;



public class _6_AssertAndVerify {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();}
	
	@Test
		public void dropdown() {
		driver.get("https://google.com");
		String Title = driver.getTitle();
//		Assert.assertEquals(Title, "Google");//it will pass
//		Assert.assertEquals(Title, "Googl");//it will not  pass
		SoftAssert soft = new SoftAssert();
		Assert.assertEquals(Title, "Googl");//it will not  pass
		System.out.println(driver.getTitle());
		System.out.println("this is the page");
		}
	@AfterTest
		public void teardown() {
		driver.quit();
		}
	}
	


