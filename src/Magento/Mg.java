package Magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mg {
	public WebDriver driver;
	
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\selenium workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://live.demoguru99.com/index.php/");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
