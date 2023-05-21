package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClasssSingleImplementation {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		By Country = By.xpath("//select[@country-data-region-id='gds-cr-two']");
		By Region = By.xpath("//select[@id='gds-cr-two']");
		doSelectbyVisibleText(Country,"India");
		doSelectbyVisibleText(Region,"Goa");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectbyVisibleText(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

}
