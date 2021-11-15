package Magneto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Repository {
	public static WebDriver driver;
  @Test(priority=0)
  public static void login() throws Exception {
	 
	  driver.findElement(Locators.usermane).sendKeys(Testdata.username);
	  driver.findElement(Locators.password).sendKeys(Testdata.password);
	  driver.findElement(Locators.signin).click();
	  Thread.sleep(5000);
	  driver.findElement(Locators.password).clear();
	  driver.findElement(Locators.password).sendKeys(Testdata.password);
	  driver.findElement(Locators.signin).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(Locators.data).click();
	  Thread.sleep(3000);
	  driver.findElement(Locators.select).click();
	  driver.findElement(Locators.timezone).click();
	  driver.findElement(Locators.upload).click();
	  Thread.sleep(3000);
	  driver.findElement(Locators.filename).sendKeys(Testdata.file);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(Locators.closex).click();
	  //add
	  driver.findElement(Locators.addbutton).click();
	  
	  
	  }
  
  @BeforeTest
  public static void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruthi reddy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get(Testdata.url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
