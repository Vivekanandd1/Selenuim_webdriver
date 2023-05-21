package test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreensShotCapturing {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
//		ChromeDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
//		TakesScreenshot ts = driver;
		TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File path = new File("src\\test\\java\\ScreenShots\\sct2"+LocalDate.now()+".jpg");
        FileUtils.copyFile(src, path);
		
		
	}

}
