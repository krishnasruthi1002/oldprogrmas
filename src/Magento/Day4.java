package Magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
public WebDriver driver;
	
	public void openurl() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://live.demoguru99.com/index.php/");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[2]/div[2]/div/button")).click();
		  
		  String parent = driver.getWindowHandle();
		  for(String child : driver.getWindowHandles()) {
			  driver.switchTo().window(child);
		  }
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/button")).click();
	driver.switchTo().window(parent);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		mgt m = new mgt();
		m.openurl();

	}

}
