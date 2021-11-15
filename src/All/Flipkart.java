package All;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Flipkart {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
