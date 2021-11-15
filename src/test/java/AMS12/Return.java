package AMS12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Return {
	public WebDriver driver;

public void  login() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sruthi reddy\\Downloads\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://return-order-app.herokuapp.com");

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().window().maximize();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
