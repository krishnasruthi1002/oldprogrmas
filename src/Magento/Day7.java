package Magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7 {

	public WebDriver driver;
	
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\cr\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://live.demoguru99.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
	}
	
	public void printorder() {
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();
		 driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.name("login[username]")).sendKeys("sruthireddy629@gmail.com");
		 driver.findElement(By.name("login[password]")).sendKeys("Ammu@1410");
		 driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/span/a[1]")).click();
		 driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day7 d= new Day7();
d.openurl();
d.printorder();
	}

}
