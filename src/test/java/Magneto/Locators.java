package Magneto;

import org.openqa.selenium.By;

public class Locators {

	public static By signin = By.xpath("//input[@class='btn btn-primary adminLoginBtn pull-right']");
	public static By usermane= By.id("adminEmail");
	public static By password = By.id("adminPass");
	public static By data = By.xpath("//span[text()='AdminConfig_Data']");
	public static By select = By.xpath("//div[text()='Select...']");
	public static By timezone = By.xpath("//div[text()='MaintenanceType']");
	//upload
	public static By upload = By.xpath("//button[text()='Upload CSV']");
	public static By filename= By.xpath("//input[@id='file']");
	//add
	public static By addbutton= By.xpath("//button[text()='Add MaintenanceType']");
	public static By closex= By.xpath("//span[text()='×']");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
