package AMS12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	public WebDriver driver;
	public Actions action;
  @Test(priority=1)
  public void f() throws Exception {
	  driver.findElement(By.id("adminEmail")).sendKeys("versha@50hertz.in");
	  driver.findElement(By.id("adminPass")).sendKeys("Password@123");
	  driver.findElement(By.xpath("//input[@class='btn btn-primary adminLoginBtn pull-right']")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.id("adminPass")).clear();
	  driver.findElement(By.id("adminPass")).sendKeys("Password@123");
	  driver.findElement(By.xpath("//input[@class='btn btn-primary adminLoginBtn pull-right']")).click();
	  Thread.sleep(10000);
	  
	  
  }  
  @Test(priority=2)
  public void schedule() throws Exception {
	  driver.findElement(By.xpath("//aside[@class='main-sidebar']//li[3]")).click();
	  action= new Actions(driver);
	WebElement element=   driver.findElement(By.xpath("//span[contains(text(),'Maintenance Mgmt')]"));
	action.moveToElement(element).build().perform();
	driver.findElement(By.xpath("//a[contains(text(),'Maintenance Dashboard')]")).click();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@class='analyticsPageView']//li[3]//a[1]")).click();
	driver.findElement(By.xpath("//div[text()='Select Country']")).click();
	driver.findElement(By.xpath("//div[text()='India']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Select State']")).click();
	driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Select Site']")).click();
	driver.findElement(By.xpath("//div[text()='H-TRG']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Upload Schedule']")).click();
//	driver.findElement(By.xpath("//div[text()='Download Sample csv']")).click();
	driver.findElement(By.xpath("//input[@name='scheduleFile']")).click();
	Thread.sleep(5000);
	 Runtime.getRuntime().exec("C:\\Users\\sruthi reddy\\Desktop\\1.exe");
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
