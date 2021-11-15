package All;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Magneto {
	public WebDriver driver;
	public Actions action;
	
	
	
  @Test
  public void f() throws Exception {
	  
	  action= new Actions(driver);
	  
	  WebElement str= driver.findElement(By.xpath("//a[@id='ui-id-5']"));
	  action.moveToElement(str).build().perform();
	  
	WebElement str2=  driver.findElement(By.xpath("//span[contains(text(),'formals')]"));
	  
	  action.moveToElement(str2).build().perform();
	  
	  
	  driver.findElement(By.xpath("//a[@id='ui-id-22']//span[contains(text(),'Hoodies & Sweatshirts')]")).click();
  Thread.sleep(3000);
  
  driver.findElement(By.xpath("//li[3]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"option-label-size-142-item-5596\"]")).click();
  driver.findElement(By.id("option-label-color-93-item-5483")).click();
  driver.findElement(By.id("product-addtocart-button")).click();
Thread.sleep(3000);
 driver.findElement(By.xpath("//a[@class='action showcart']")).click();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//button[contains(text(),'Proceed to Checkout')]")).click();
  
  
  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.harishpasala.ml/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close(); 
  }

}
