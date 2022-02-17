package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowResize {
	
	WebDriver driver;
	String url = "https://Flipkart.com";
	
	@Before
	public void setup()
	{
		Dimension Ds =  new Dimension(600, 600);
		
		driver  = new ChromeDriver();
		driver.manage().window().setSize(Ds);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void dropdown()
	{
		System.out.println("the page title is " + driver.getTitle());
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
