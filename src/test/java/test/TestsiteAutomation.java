package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestsiteAutomation {
//	 WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement FullName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FullName.sendKeys("vivek");
		
        WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        LastName.sendKeys("Deshmukh");
		
        WebElement Adress = driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea"));
		Adress.sendKeys("E115 Jai Ambe Nagar Ahemdabad");
		
        WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys("vivekanandd1@live.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@type='tel' ]"));
		Phone.sendKeys("8109772504");
		
        WebElement SexSelection = driver.findElement(By.xpath("//input[@type='radio' ]"));
		SexSelection.click();
		
		WebElement Hobbies = driver.findElement(By.xpath("//input[@value='Movies' ]"));
		Hobbies.click();
		
		WebElement BoxClick = driver.findElement(By.xpath("	//div[@id='msdd']"));
		BoxClick.click();
				
//		WebElement Language = driver.findElement(By.xpath("//div[@id='msdd']")); 
//		Language.click();
//		
//		WebElement LangSelect = driver.findElement(By.xpath("//div/ul/li/a[text()='English']"));
//		LangSelect.click();
		
		WebElement Skills = driver.findElement(By.xpath("//select/option[@value='Java']"));
		Skills.click();
		
		WebElement CountrySelect = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		CountrySelect.click();
	
		WebElement CountryType = driver.findElement(By.xpath("//span/input[@class='select2-search__field']"));
		CountryType.sendKeys("india");
		CountryType.sendKeys(Keys.ENTER);
	
		 
		//div[@style='display: block;']/ul/li/a
		//div[@style='display: block;']/ul/li/a[text()='English']
		//div[@id='msdd']
		//li[@class='ng-scope']
		
		WebElement Year = driver.findElement(By.xpath("//select/option[@value='1992']"));
		Year.click();
		
		WebElement month = driver.findElement(By.xpath("//select/option[@value='December']"));
		month.click();
		
		WebElement date = driver.findElement(By.xpath("//select/option[@value='9']"));
		date.click();
		
		WebElement password  = driver.findElement(By.id("firstpassword"));
		password.sendKeys("Rony@11888");
		
		WebElement secondpassword  = driver.findElement(By.id("secondpassword"));
		secondpassword.sendKeys("Rony@11888");
		
			
		
		
		Thread.sleep(8000);
		
		driver.quit();
		
        
		
		
		
        //WebElement SkillSelect = driver.findElement(By.xpath("//select[@value='Adobe InDesign']"));
		
		
		
		
		
		
	}

}
