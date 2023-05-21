package test;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScreenShotCapture1 {
	
	WebDriver driver;
	WebDriverWait wait;
	String url = "https://www.amazon.in/";
	
	@Before 
	public void setup()
	{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
	}
	
	@Test
	public void dropdown()
	{
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Laptop");
		
		WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button"));
		SearchButton.click();
		
		wait.until(ExpectedConditions.titleContains("Amazon.in : Laptop"));
		
		screenshotCapture1(driver,"amazon_laptop");	
		
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

	private void screenshotCapture1(WebDriver driver, String filenametoBe) {
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try
		{
//			Files.copy(file, new File( System.getProperty("user.dir") + "/src/test/java/ScreenShots/" + filenametoBe + System.currentTimeMillis()+".jpg"));

			Files.copy(file, new File( System.getProperty("user.dir") + "/src/test/java/ScreenShots/" + filenametoBe +LocalDate.now() +".jpg"));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
