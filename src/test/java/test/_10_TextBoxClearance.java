package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_TextBoxClearance {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.F5);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("saree");
		Set<String> widn = driver.getWindowHandles();
//		int count = Integer.parseInt(widn);
		System.out.println(widn.size());
		Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(5000);
		driver.quit();
	}

}
