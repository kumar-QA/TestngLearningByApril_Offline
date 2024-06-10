import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngAttribuets {
	
	@Test(description = "Verifying loginfunction with valid data")
	public void A() {
		System.out.println("A method");
	}
//	@Test(description = "Verifying loginfunction with invalid data")
//	public void B() {
//
//		System.out.println("B method");
//	}
//	@Test(invocationCount = 3)
//	public void C() {
//
//		System.out.println("c method");
//	}
//	@Test(enabled = false)
//	public void D() {
//
//		System.out.println("D method");
//	}
//	@Test(timeOut = 1000)
//	public void E() throws InterruptedException {
//		Thread.sleep(3000);
//		System.out.println("E method");
//		
//	}
//	
//	@Test 
//	public void login() {
//		System.out.println("defrgrtgh";
//	}
//	@Test(dependsOnMethods = "login",alwaysRun = true)
//	public void clickonProductLink() {
	
//	}
	@DataProvider
	@Test
	public Object[][] loginTestData() {
		
		Object[][] obj= {{"abc","abc123"},{"bcd","bcd123"},{"efg","efg123"},{"student","Password123"}};
		return obj;
	}
	
	
	@Test(dataProvider = "loginTestData",enabled = false)
	public void verifyLoginWithMultipleCredentials(String uname,String pwd) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		username.clear();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		SubmitBtn.click();
	}
	
	@Test(dataProvider = "loginTestData")
	public void g(
			String uname,String pwd) {
		System.out.println(uname + "  "+pwd);
	}
	


}
