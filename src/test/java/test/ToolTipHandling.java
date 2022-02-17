package test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ToolTipHandling {

	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips/");
	}
	@Test
	public void dropDown() throws InterruptedException {
		
		WebElement Button = driver.findElement(By.id("toolTipButton"));
		
		Thread.sleep(4000);
		
		Actions acts = new Actions(driver);
		acts.moveToElement(Button).build().perform();
		
		Thread.sleep(3000);
		
		WebElement TextElement = driver.findElement(By.xpath("//div[contains(text(),'You hovered over the Button')]"));
		String suggestionTextElement = TextElement.getText();
		System.out.println("suggestion box text is = " +suggestionTextElement);
		Assert.assertEquals("You hovered over the Button", suggestionTextElement);
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}

