package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class des {
public static void main(String[] args) {

	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	WebElement Dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//	Select select = new Select(Dropdown);
//	select.selectByIndex(2);
//	select.getFirstSelectedOption().getText();
}

}
