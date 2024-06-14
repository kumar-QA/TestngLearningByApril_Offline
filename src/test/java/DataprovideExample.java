import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovideExample {

	@DataProvider
	public String[][] TestData(){
	   String [][] obj={{"user123","kumar123"},{"user456","sai123"},{"user789","ram123"}};
	   return obj;
	}
	@Test(dataProvider = "TestData")
	public void verifyLoginFunctionWithMultipleData(String username,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(username);
	
		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.id("submit")).click();
	}

}
