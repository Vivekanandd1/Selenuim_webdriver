package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _11_MultipleInstance {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//it will not
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		
		driver.get("https://web.telegram.org/k/");
		
		driver.switchTo().alert().accept();
		
		
	}
	

}
