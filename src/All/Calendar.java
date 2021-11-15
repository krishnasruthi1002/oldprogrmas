package All;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		
		
		
		WebElement element= driver.findElement(By.name("ctl00$mainContent$view_date1"));
		String dateval= "10/04";
		selectdatebyJS(driver, element, dateval);
		
		//driver.findElement(By.xpath("//a[@title='Hotels']")).click();
	//	WebElement element=  driver.findElement(By.name("ctl00$mainContent$txt_Fromdate_MST"));
	//	String dateval= "11-04-2020";
		//selectdatebyJS(driver, element, dateval);
			
		

	}

	public static void selectdatebyJS(WebDriver driver, WebElement element, String dateval) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
		
		
		
	}
	
	
}
