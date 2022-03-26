package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraRadioButton {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("jeans");
		driver.findElement(By.className("desktop-submit")).click();
		driver.findElement(By.xpath("//label[text()='Men']")).click();
	}

}
