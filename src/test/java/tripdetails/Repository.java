package tripdetails;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Repository {
	public static WebDriver driver;
  @Test
  public static void flight() throws Exception {
	  
	  driver.findElement(Locators.roundtrip).click();
  }
  @BeforeTest
  public void beforeTest() {
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
