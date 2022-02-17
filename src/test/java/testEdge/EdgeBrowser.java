package testEdge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com");
		
		String titleofPage = driver.getTitle();
		
		System.out.println("title of page is="+ titleofPage);
		
		driver.quit();
		
		
		
		
	
	}
	

}
