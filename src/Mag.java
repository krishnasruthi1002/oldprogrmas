

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mag {
	
	public WebDriver driver;			
  @Test(priority=0)
  public void createacc() throws Exception {
	  driver.findElement(By.linkText("Create an Account")).click();
	  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sruthi");
	  driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("lanakpothu");
	  driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("chinnireddy629@gmail.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Reddy1002");
	  driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("Reddy1002");
driver.findElement(By.xpath("//button[@title='Create an Account']")).click();

Thread.sleep(3000);
	   
  }
  
  @Test(priority=9)
  
  public void signout() {
	  driver.findElement(By.linkText("        Sign Out    ")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.harishpasala.ml/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
