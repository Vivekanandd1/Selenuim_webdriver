package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_StaleElementException {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D958631386%26activity%3Dheader-mail");
		WebElement dc = driver.findElement(By.id("login-username"));
		dc.sendKeys("xyz@yahoo.com");
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement cc = driver.findElement(By.id("login-username"));
		cc.sendKeys("byz@yahoo.com");
	}

}
