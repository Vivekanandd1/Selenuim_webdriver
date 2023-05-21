package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
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

public class ScreenShotCapture {

	WebDriver driver;
	WebDriverWait wait;
	//ScreenShotCapture sd;
	String url = "https://google.com";
	
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
	public void TC_1()
	{
		WebElement Searchbox = driver.findElement(By.name("q"));
		Searchbox.sendKeys("Appium Tool");
		
		WebElement Seachbutton = driver.findElement(By.name("btnK"));
		Seachbutton.click();
		
		wait.until(ExpectedConditions.titleContains("Appium"));
		
		screenshotCapture(driver,"appiumtool");
		
	}
	
	 @After
	   public void teardown() throws InterruptedException
	   {
		   Thread.sleep(3000);
		   driver.quit();
	   }

	 public static void screenshotCapture(WebDriver driver, String fileNameToBe)
	  {
		// 1. Take Screenshot & store into a File
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// 2. Copy the captured screenshot into the desired destination path
		try {
			
			
			// 3. Transferring the screenshot without hard coding (advisable to be used like this)
			Files.copy(file, new File( System.getProperty("user.dir") + "/src/test/java/ScreenShots/" + fileNameToBe + System.currentTimeMillis()+".jpg"));
			//Getting image saved by date name
//			Files.copy(file, new File( System.getProperty("user.dir") + "/src/test/java/ScreenShots/" + fileNameToBe + LocalDateTime.now()+".jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
  
  }
}


