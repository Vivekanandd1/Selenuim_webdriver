package test;

import java.io.File;
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

public class ScreenShotCapture1 {
	
	WebDriver driver;
	WebDriverWait wait;
	String url = "https://www.amazon.in/";
	
	@Before 
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		wait  = new WebDriverWait(driver, 30);
		
	}
	
	@Test
	public void dropdown()
	{
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("Laptop");
		
		WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button"));
		SearchButton.click();
		
		wait.until(ExpectedConditions.titleContains("Amazon.in : Laptop"));
		screenshotCapture(driver,"Amazon_Laptop");
		
		
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

	private void screenshotCapture(WebDriver driver, String filenametoBe) {
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try
		{
			Files.copy(file, new File( System.getProperty("user.dir") + "/src/test/java/ScreenShots/" + filenametoBe + System.currentTimeMillis()+".jpg"));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
