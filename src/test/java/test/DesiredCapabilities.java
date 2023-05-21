package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DesiredCapabilities {

	WebDriver driver;
	
	@Before
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
//		DesiredCapabilities cap = new DesiredCapabilities();
		
		ChromeOptions ops = new ChromeOptions();
	    ops.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(ops);
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
