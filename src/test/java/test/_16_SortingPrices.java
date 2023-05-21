package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _16_SortingPrices {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		ArrayList<Integer>a = new ArrayList<>();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		Map<WebElement, Integer> map  =  new HashMap<WebElement, Integer>();
		for(int i=0;i<prices.size();i++) {
			if(prices.get(i).getText()!="") {
			map.put(prices.get(i),Integer.parseInt(prices.get(i).getText().replaceAll(",", "")));
			}
		}
		
		List<Entry<WebElement, Integer>> list  = new ArrayList<Map.Entry<WebElement,Integer>>(map.entrySet());
//		list.sort(Entry.comparingByValue());
		for(Entry es : list) {
			System.out.println(es.getValue());
		}
		}
	}


