package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions handlingSSL = new ChromeOptions();
		handlingSSL.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(handlingSSL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS );
		
		driver.get("https://demoqa.com/droppable/");
		
		WebElement FirstEle  = driver.findElement(By.id("draggable"));
		WebElement LastEle  = driver.findElement(By.id("droppable"));
		
	
		Actions act = new Actions(driver);
		act.dragAndDrop(FirstEle, LastEle).build().perform();
		System.out.println("title of page is " + driver.getTitle());
		//act.clickAndHold(FirstEle).moveToElement(LastEle).build().perform();
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
