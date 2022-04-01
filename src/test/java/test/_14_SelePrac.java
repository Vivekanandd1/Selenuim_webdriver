package test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class _14_SelePrac {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void landup() throws InterruptedException, IOException {
		driver.navigate().to("https://www.myntra.com/");
		driver.findElement(By.linkText("Home & Living")).click();
		Thread.sleep(3000);
		WebElement dc = driver.findElement(By.cssSelector("a[data-group='studio']"));
		Actions act = new Actions(driver);
		act.moveToElement(dc).build().perform();
		TakesScreenshot sc = ((TakesScreenshot)driver);
		String path = "src\\test\\java\\ScreenShots"+System.currentTimeMillis()+".jpg";
		File dest = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(dest, new File(path));
		
		
	}

}
