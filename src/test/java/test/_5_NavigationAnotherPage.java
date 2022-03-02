package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_NavigationAnotherPage {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.myntra.com");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.navigate().getClass());
		driver.navigate().refresh();
        driver.close();
        
		
	}

}
