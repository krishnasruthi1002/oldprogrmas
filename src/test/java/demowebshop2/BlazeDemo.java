package demowebshop2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.id("inputUsername")).sendKeys("sruthi");
		driver.findElement(By.name("inputPassword")).sendKeys("MMM");
		driver.findElement(By.className("signInBtn")).click();
		
String errorMessege = driver.findElement(By.className("error")).getText();
if (errorMessege == " Incorrect username or password"){
System.out.println(errorMessege);
		}
		else {
			System.out.println("Enter the correct credentials");
		}
	}

}
