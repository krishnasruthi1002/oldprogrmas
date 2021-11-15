package Magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayyy5 {

	public WebDriver driver;
	
	
	
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\cr\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void createaccount() {
		driver.findElement(By.xpath("//span[@class='label'][contains(text(),'Account')]")).click();
		driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div/div[1]/div[2]/a/span/span")).click();
	driver.findElement(By.id("firstname")).sendKeys("sruthi");
	driver.findElement(By.id("lastname")).sendKeys("reddy");
	driver.findElement(By.id("password")).sendKeys("Ammu@1410");
	driver.findElement(By.id("confirmation")).sendKeys("Ammu@1410");
	driver.findElement(By.id("email_address")).sendKeys("sruthireddy629@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();

	}
	
	public void tv() {
		driver.findElement(By.linkText("TV")).click();
		driver.findElement(By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[1]//a[1]")).click();
		driver.findElement(By.name("login[username]")).sendKeys("sruthireddy629@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Ammu@1410");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"wishlist-view-form\"]/div/div/button[1]")).click();
		driver.findElement(By.id("email_address")).sendKeys("sruthireddy629@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dayyy5  d= new Dayyy5();
		d.openurl();
		d.createaccount();
		d.tv();
		

	}

}
