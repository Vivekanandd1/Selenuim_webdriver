package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _3_OpenCartRadioButton {
	WebDriver driver;
	String Url = "https://demo.opencart.com/index.php?route=account/register";
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Url);
	}
	
	@Test()
	public void dropdown() {
		WebElement MaleradioBTN = driver.findElement(By.xpath("//input[@value='1' and @name='newsletter']"));
		MaleradioBTN.click();
	}
	
	@Test
	public void dropdown1() {
		WebElement MaleradioBTN = driver.findElement(By.xpath("//input[@value='0' and @name='newsletter']"));
		MaleradioBTN.click();
	}
	
	
	@After()
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
