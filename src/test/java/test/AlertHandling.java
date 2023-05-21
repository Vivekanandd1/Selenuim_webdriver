package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
//		driver.get("http://the-internet.herokuapp.com/");
//		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(50));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//
//		alert.sendKeys("username");
//
//		alert.accept();
		/*This is the simplest way i found it right now stucked in how can we send username and password in auth popup*/
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
