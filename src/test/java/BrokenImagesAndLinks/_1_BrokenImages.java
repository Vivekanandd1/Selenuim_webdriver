package BrokenImagesAndLinks;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import test.forloop;

public class _1_BrokenImages {

    static WebDriver driver;
	String Url = "http://the-internet.herokuapp.com/broken_images";
	
	@Before
	public void setup()
	{
		//System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");//its optional to draft this line of code
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(Url);
		
	}
	
	@Test
	public void BrokenImages()
	{
		List<WebElement> linksWithImageTag = driver.findElements(By.tagName("img"));
		System.out.println("total image found in wbpage " + Url + " is " + linksWithImageTag.size());
		
		for (int i = 0; i < linksWithImageTag.size(); i++)
		{
			String ImageSourceLink = linksWithImageTag.get(i).getAttribute("src");
			
			try
			{
				URL Url = new URL(ImageSourceLink);
				URLConnection urlconnection = Url.openConnection();
				HttpURLConnection httpurlconnection = (HttpURLConnection) urlconnection;
				httpurlconnection.setConnectTimeout(4000);
				httpurlconnection.connect();
				if (httpurlconnection.getResponseCode() == 200)
				{
					System.out.println("the image source link is " + ImageSourceLink + " is " + httpurlconnection.getResponseCode());
					
				}
				else
				{
					System.err.println("the image source link is " + ImageSourceLink + " is " + httpurlconnection.getResponseCode());
				}
				
				httpurlconnection.disconnect();
			}
			
			catch (Exception e)
			{
				System.out.println("ther is problem with this link" + ImageSourceLink);
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
