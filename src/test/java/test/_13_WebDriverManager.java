package test;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _13_WebDriverManager {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//		opt.addArguments("--disable-notifications");
		WebDriver driver =  new ChromeDriver(opt);
		driver.get("https://www.youtube.com/");
		
	}

}
