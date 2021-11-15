package Magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6 {
	
	public WebDriver driver;
	 public void openurl() {
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\cr\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://live.demoguru99.com/index.php");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	 }
	 
	 public void productpurchase() {
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();
		 driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.name("login[username]")).sendKeys("sruthireddy629@gmail.com");
		 driver.findElement(By.name("login[password]")).sendKeys("Ammu@1410");
		 driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		                                                  
driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")).click();
driver.findElement(By.xpath("//*[@id=\"item_45023\"]/td[5]/div/button")).click();
driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[1]/ul/li/buttonv")).click();
driver.findElement(By.id("billing:street1")).sendKeys("123456");
driver.findElement(By.id("billing:city")).sendKeys("chennai");
new Select(driver.findElement(By.id("billing:region_id"))).selectByVisibleText("California");
driver.findElement(By.id("billing:postcode")).sendKeys("100234");
new Select(driver.findElement(By.id("billing:country_id"))).selectByVisibleText("Central African Republic");
driver.findElement(By.id("billing:telephone")).sendKeys("12345678");
driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button")).click();


driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
driver.findElement(By.id("p_method_checkmo")).click();
driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button")).click();
driver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button")).click();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day6 d = new Day6();
		d.openurl();
		d.productpurchase();

	}

}
