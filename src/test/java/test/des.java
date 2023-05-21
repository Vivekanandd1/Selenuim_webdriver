
package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class des {
//	WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("http://demo.automationtesting.in/Register.html");
//	 driver.findElement(By.cssSelector("span[role='combobox']")).click();
//	 driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys("india");
//	 driver.findElement(By.cssSelector("input.select2-search__field")).sendKeys(Keys.ENTER);
     driver.findElement(By.cssSelector("div[id='msdd']")).click();
     List<WebElement> dc = driver.findElements(By.cssSelector("li[class='ng-scope']"));
     for(WebElement el:dc) {
    	 if(el.getText().equalsIgnoreCase("Russian")) {
    		 el.click();
    	 }
    	 else if(el.getText().equalsIgnoreCase("Malay")) {
    		 el.click();
    	 }
     }
     
}
}
	 