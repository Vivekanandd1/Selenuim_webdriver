package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMode {
	
	WebDriver driver;

	@Before
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		
	}
	
	@Test
	public void dropdown()
	{
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("cucumber tool");
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.sendKeys(Keys.ENTER);
		System.out.println("the page title is " + driver.getTitle());
		WebElement target = driver.findElement(By.xpath("//h3[contains(text(),'What is Cucumber Testing Tool')]"));
		target.click();
		System.out.println("title of page is " +driver.getTitle());
		
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
