package AMS12;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Sanity {
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.id("adminEmail")).sendKeys("versha@50hertz.in");
	  driver.findElement(By.id("adminPass")).sendKeys("Password@123");
	  driver.findElement(By.xpath("//input[@class='btn btn-primary adminLoginBtn pull-right']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("adminPass")).clear();
	  driver.findElement(By.id("adminPass")).sendKeys("Password@123");
	  driver.findElement(By.xpath("//input[@class='btn btn-primary adminLoginBtn pull-right']")).click();
	  Thread.sleep(3000);
	  
	  
	 //wind dashboard
	  driver.findElement(By.xpath("(//div[@class='menuBox'])[2]")).click();
	  action= new Actions(driver);
		WebElement element= driver.findElement(By.xpath("//span[text()='Dashboard']"));
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Executive Dashboard")).click();
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		
		//wind analysis windrose
		
		 driver.findElement(By.xpath("(//div[@class='menuBox'])[2]")).click();
		 action= new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Analysis']"));
	action.moveToElement(element1).build().perform();
	driver.findElement(By.linkText("Wind Rose")).click();
	driver.findElement(By.xpath("//button[contains(@class,'selected-date-range-btn btn')]")).click();
	driver.findElement(By.xpath("//li[text()='Last 7 Days']")).click();
	driver.findElement(By.xpath("//div[text()='Select Country']")).click();
	driver.findElement(By.xpath("//div[text()='India']")).click();
	driver.findElement(By.xpath("//div[text()='Select State']")).click();
	driver.findElement(By.xpath("//div[text()='Gujarat']")).click();
	driver.findElement(By.xpath("//div[text()='Select Site']")).click();
	driver.findElement(By.xpath("//div[text()='Vaghnagar']")).click();
	driver.findElement(By.xpath("//span[text()='Select...']")).click();
	driver.findElement(By.xpath("//div[text()='MUV08']")).click();
	driver.findElement(By.xpath("//div[text()='Select Graph Type']")).click();
	driver.findElement(By.xpath("//div[text()='Sector 8']")).click();
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi reddy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://authqa.50hertz.in/SEL_UI/login?redirect=https://amtqa.50hertz.in");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
