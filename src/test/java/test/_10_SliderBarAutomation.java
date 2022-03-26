package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _10_SliderBarAutomation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumbase.io/demo_page");
		WebElement dc = driver.findElement(By.cssSelector("input.slider"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(dc, 373, 0).perform();
		WebElement drpdwn = driver.findElement(By.cssSelector("select.selectClass"));
		
		Select sc = new Select(drpdwn);
		sc.selectByIndex(3);
	}

}
