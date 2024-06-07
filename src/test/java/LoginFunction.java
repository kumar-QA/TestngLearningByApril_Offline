import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFunction {	
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@AfterMethod
	public void closethebrowser() {
		driver.close();
	}
	@Test(priority =2 )
	public void verifyLoginDunctionWithValidData() {
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
	}
	@Test(priority = 3)
	public void verifyLoginFunctionWithInvalidData() {
		driver.findElement(By.id("username")).sendKeys("adxaft");
		driver.findElement(By.id("password")).sendKeys("awdw3");
		driver.findElement(By.id("submit")).click();
	}
	@Test(priority = 1)
	public void verifyLoginFunctionWithvalidusernameAndInvalidpwd() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("awdw3");
		driver.findElement(By.id("submit")).click();
	}

}
