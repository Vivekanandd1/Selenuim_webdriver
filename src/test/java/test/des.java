
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class des {
//	WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 driver.get("https://www.google.co.in/");
	 String titleofpage = driver.getTitle();
	 System.out.println("Title of page is :"+titleofpage);
	 if(titleofpage.equals("Google"))
	 {
		 System.out.println("title of page is correct test pass");
	 }
	 else  
	 {
		 System.out.println("title of page is incorrect test fail");
	 }
	 driver.quit();
}

}
