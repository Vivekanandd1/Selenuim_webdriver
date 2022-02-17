package PropertiesReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileReadingProperties {
	
	public Properties prop;
	WebDriver driver;
	
	@Test
	public void readingProp()
	{
		prop = new Properties();
		try 
		{
			FileInputStream  path = new FileInputStream(System.getProperty("user.dir") +"/src/test/java/PropertiesReading/Config.properties/");
			//src\test\java\PropertiesReading\Config.properties
			prop.load(path);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found pls chang directory");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("io excpetion occured");
			e.printStackTrace();
		}
		
//		System.out.println(prop.getProperty("url"));
//		System.out.println(prop.getProperty("ide"));
//		System.out.println(prop.getProperty("maximize"));
//		System.out.println(prop.getProperty("username"));
//		System.out.println(prop.getProperty("passcode"));
		
        driver = new ChromeDriver();
		
		if (prop.getProperty("maximize").equalsIgnoreCase("yes")) {
			driver.manage().window().maximize();
		}	
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Automation Testing");
		
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.click();
		
		driver.quit();
	}
	

}
