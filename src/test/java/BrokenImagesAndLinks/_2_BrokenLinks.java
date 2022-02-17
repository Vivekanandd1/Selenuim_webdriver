package BrokenImagesAndLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_BrokenLinks {
	
	static WebDriver driver;
	String url = "http://the-internet.herokuapp.com/";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	
	@Test
	public void BrokenLinks()
	{
		List<WebElement> linksLocation = driver.findElements(By.tagName("a"));
		System.out.println("this webpage having " + linksLocation.size() + " tags with links in it ");
		
		for (int i=0; i<linksLocation.size(); i++)
		{
			String TagLinks = linksLocation.get(i).getAttribute("href");
			try
			{
				URL url = new URL(TagLinks);
				URLConnection urlconnection = url.openConnection();
				HttpURLConnection httpsurlconnection = (HttpURLConnection) urlconnection; //always use Http(Https can create a issue in printing result in console
				httpsurlconnection.setConnectTimeout(4000);
				httpsurlconnection.connect();
				if (httpsurlconnection.getResponseCode() == 200)
				{
					System.out.println("this links with link " + TagLinks +" is "+ httpsurlconnection.getResponseCode());
				}
				else
				{
					System.out.println("this links with link " + TagLinks +" is "+ httpsurlconnection.getResponseCode());
				}
				httpsurlconnection.disconnect();
			}
			
			catch(Exception e)
			{
				System.out.println("ther is problem with this link" + TagLinks);
				e.printStackTrace();
			}
					
		}
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
	
}


