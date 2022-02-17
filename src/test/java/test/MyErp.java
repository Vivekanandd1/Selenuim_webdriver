package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyErp {
    
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.drive",System.getProperty("user.dir")+"/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://120.72.93.235:8001/");
		
		WebElement IDlocator = driver.findElement(By.id("txtUserID"));
		IDlocator.sendKeys("MT-W-2409");
		
		WebElement PassWordlocator = driver.findElement(By.id("txtPassword"));
		PassWordlocator.sendKeys("admin");
		
		WebElement SubmittBTn = driver.findElement(By.id("btnlogin"));
		SubmittBTn.click();
		
		WebElement InOutBTn = driver.findElement(By.id("ContentPlaceHolder1_A8"));
		InOutBTn.click();
		
//		WebElement MarkBTn = driver.findElement(By.id("ContentPlaceHolder1_btnInTime"));
//		MarkBTn.click();
//		
//		WebElement ProjectSelect= driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_ddlProject']/option[@value=257]"));
//		ProjectSelect.click();
//
//		WebElement MarkOut  = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnOutTime']"));
//		MarkOut.click();
//		
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}
	
}
