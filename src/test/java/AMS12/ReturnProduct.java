package AMS12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReturnProduct {
	
	public WebDriver driver;
  @Test
  public void Login() throws Exception {
	  driver.findElement(By.xpath("//input[@id='order-id']")).click();
	  driver.findElement(By.xpath("//input[@id='order-id']")).sendKeys("1257945872");
	  driver.findElement(By.xpath("//button[contains(text(),'Find Order')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[contains(text(),'Return This Product')]")).click();
	  Thread.sleep(6000);
	   String messege= driver.findElement(By.xpath("//div[contains(text(),'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkZWNvZGVkI')]")).getText();
	   System.out.println(messege);
	 
	   File f=new File("C:\\Users\\sruthi reddy\\Desktop\\result.txt");
	   FileWriter fw=new FileWriter(f);
	   BufferedWriter bw = new BufferedWriter(fw);
	   bw.write(messege);
	   bw.close();
	   fw.close();
	  
	


	  
  }

	

@BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi reddy\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://return-order-app.herokuapp.com");

	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
