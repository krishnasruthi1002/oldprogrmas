package Magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mgt {
	public WebDriver driver;
	
	public void openurl() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://live.demoguru99.com/index.php/");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
	String ActualTitle  =  driver.getTitle();
	System.out.println(ActualTitle);
	
  String ExpectedTitle  = "HP";
  if (ActualTitle.contentEquals(ExpectedTitle)) {
	  System.out.println("Same");
	  
	  

} 
  else {
System.out.println("Not same");

}
  driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
  
  driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
  driver.findElement(By.xpath("//div[@class='block block-list block-compare']//button[@class='button']")).click();
  String parent = driver.getWindowHandle();
  for(String child : driver.getWindowHandles()) {
	  driver.switchTo().window(child);
  }
  Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/button")).click();
driver.switchTo().window(parent);

  
  String ActualTitle1 = driver.getTitle();
  System.out.println(ActualTitle1);
  
  new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"))).selectByVisibleText("Name"); 
  
  driver.findElement(By.xpath("//img[@id='product-collection-image-1']")).click();
  
  driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[4]/div/div/div[2]/button")).click();
 
	driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("1000");
	driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button")).click();
	
String chinni = 	driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")).getText();
 System.out.println(chinni);
 
 driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]/span/span")).click();
 
}
	
		
			  
		  
	
	

	public static void main(String[] args) throws Exception {
		mgt m = new mgt();
		m.openurl();
	
		// TODO Auto-generated method stub

	}

}
