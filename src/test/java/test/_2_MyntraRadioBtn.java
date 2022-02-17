package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _2_MyntraRadioBtn {
	WebDriver driver;
	String url = "https://www.myntra.com/";
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	@Test
	public void dropdown() {
		WebElement SearchBox =driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		SearchBox.sendKeys("jack&Jones");
	WebElement SearchBtn = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
	SearchBtn.click();
	WebElement filterBTn = driver.findElement(By.xpath("//label/input[@value='men,men women']"));
//	
	Actions action = new Actions(driver);
	action.moveToElement(filterBTn);
	
	//filterBTn = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
	//filterBTn.click();
    WebElement CategoryBTn = driver.findElement(By.xpath("//label[text()='Jeans']"));
    CategoryBTn.click();
	
	
	
	
	
	}

}
