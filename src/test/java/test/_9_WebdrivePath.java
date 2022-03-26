package test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class _9_WebdrivePath {
	public static void main(String[] args) {
		// 1. first way
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/geckodriver.exe");
		
		// 2. Second way
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Sony\\eclipse-workspace\\Selenuim_webdriver\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
	}

}
