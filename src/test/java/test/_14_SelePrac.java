package test;

import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Link;
import com.google.common.io.Files;

public class _14_SelePrac {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void landup() throws InterruptedException, IOException {
		driver.navigate().to("https://www.myntra.com/");
//		driver.findElement(By.linkText("Home & Living")).click();
//		Thread.sleep(3000);
//		WebElement dc = driver.findElement(By.cssSelector("a[data-group='studio']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(dc).build().perform();
		TakesScreenshot sc = ((TakesScreenshot)driver);
		String path = "src\\test\\java\\ScreenShots\\SC"+TimeUnit.MINUTES+".jpg";
		File dest = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(dest, new File(path));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement Links = driver.findElement(By.xpath("//div[@class='desktop-usefulLinks']"));
		List<WebElement> bifercate = Links.findElements(By.tagName("a"));
		System.out.println("list is "+bifercate.size());
		for(WebElement ele:bifercate) {
			ele.click();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
//			driver.navigate().back();
		}
			
		}
	
		
		
	}

