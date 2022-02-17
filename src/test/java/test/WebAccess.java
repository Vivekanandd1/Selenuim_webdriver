package test;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.language.bm.Lang;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAccess {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
//		WebElement Name = driver.findElement(By.xpath("//div/input[@placeholder='First Name']"));
//		Name.sendKeys("xyz");
		
//		WebElement skills  = driver.findElement(By.xpath("//select[contains(@id,'Skill')]"));
//		skills.click();
//		
		
		WebElement langSelect = driver.findElement(By.id("msdd"));
		langSelect.click();
		
//		WebElement mylang = driver.findElement(By.xpath("//ul/li/a[@style='text-decoration:none' and text()='English']"));
//		mylang.sendKeys(Keys.ENTER);


	
//		WebElement CountryType = driver.findElement(By.xpath("//span/input[@class='select2-search__field' and @type='search']"));
//		CountryType.sendKeys("india");
//		CountryType.sendKeys(Keys.ENTER);
//		
	}

}
//div/ul/li/a[text()='English']