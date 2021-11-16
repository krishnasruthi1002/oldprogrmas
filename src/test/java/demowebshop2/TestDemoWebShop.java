package demowebshop2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemoWebShop {

	public WebDriver driver;

	@Test
	public void login() throws IOException {

		// to click on login button
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();

		// validating the welcome message

		WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
		String text = message.getText();
		String expectedText = "Welcome, Please Sign In!";
		Assert.assertEquals(text, expectedText);
// if else condition to print the statement whether validate or not
		// login with credentials

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("testdemowebshop@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Test123");
		driver.findElement(By
				.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]"))
				.click();
	}
		
		@Test(dependsOnMethods= {"login"})
public ArrayList<String> getDatas(String testcaseName) throws IOException{
//can use excel to get the login credentials
//fileinputstream to give the path
		ArrayList<String> a= new ArrayList<String>();
		
		FileInputStream fi = new FileInputStream("C:\\Users\\sruthi reddy\\Desktop\\logindetails.xlsx");
		// creating object for workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fi);

		// get the no of sheets
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Testcase")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// identify the particular column by scanning the header row

				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();

				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int coloumn = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("Tetcase")) {
						// to get the index of desired column number
						coloumn = k;
					}
					k++;
				}

				// once column is identified then scan entire column to identify what the row we
				// want
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName)) {
						// after we found the row pull all the data and feet into test data
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
						a.add(cv.next().getStringCellValue())	;
						}
					}
				}

			}

		}
		return a;	
		}
//validate that user account id on top right
@Test(dependsOnMethods= {"login,getDatas"})
public void shopkart() {
		// clear the shopping cart.
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
		driver.findElement(
				By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"))
				.click();

		// select books from categories
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]"))
				.click();
		driver.findElement(By.xpath("//input[@id='addtocart_45_EnteredQuantity']")).clear();
		driver.findElement(By.xpath("//input[@id='addtocart_45_EnteredQuantity']")).sendKeys("3");

		// click on add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-45']")).click();

		// validating the message for add cart
		WebElement message1 = driver.findElement(By.xpath("//body/div[@id='bar-notification']/p[1]"));
		String text1 = message1.getText();
		String expectedText1 = "The product has been added to your shopping cart";
		Assert.assertEquals(text1, expectedText1);

		// click on shopping cart
		driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		// validate the sub total

		// click on checkout
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		// select new address from billing address
		driver.findElement(
				By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]"))
				.click();
		// click on shipping address
		driver.findElement(
				By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]"))
				.click();
		// click on shipping method
		driver.findElement(By.xpath("//input[@id='shippingoption_0']")).click();
		driver.findElement(
				By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]"))
				.click();
		// select payment method
		driver.findElement(
				By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]"))
				.click();

		// validate the payment message for COD
		WebElement message2 = driver.findElement(By.xpath(
				"//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]"));
		String text2 = message2.getText();
		String expectedText2 = "You will pay by COD";
		Assert.assertEquals(text2, expectedText2);

		// select payment information
		driver.findElement(
				By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/input[1]"))
				.click();

		// select confirm order
		driver.findElement(
				By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[2]/input[1]"))
				.click();

		// validate the message
		WebElement message3 = driver
				.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
		String text3 = message3.getText();
		String expectedText3 = "Your order has been successfully processed!";
		Assert.assertEquals(text3, expectedText3);

		driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();

		// logout of the application
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();

	}


	@BeforeTest
	public void beforeTest() {

		// to launch the browser and login to the page
		System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
