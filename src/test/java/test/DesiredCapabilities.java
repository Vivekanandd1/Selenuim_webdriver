package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DesiredCapabilities {

	WebDriver driver;
	
	@Before
	public void setUp()
	{
		//org.openqa.selenium.remote.DesiredCapabilities cap = new org.openqa.selenium.remote.DesiredCapabilities();
		org.openqa.selenium.remote.DesiredCapabilities cap  = new org.openqa.selenium.remote.DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		///cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://cacert.com/");
		
	}
	
		@Test
	public void dropdown()
	{
		System.out.println(driver.getTitle());
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
