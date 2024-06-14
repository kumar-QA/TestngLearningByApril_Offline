import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TASK {
//	@DataProvider
//	public String[] TestDataForSearchProduct() {
//		String[] products = { "abc","Build your own computer" };
//		return products;
//	}
	@Test()
	public void verify_SearchFunctionalityWitheMultip() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement usernameField = driver.findElement(By.id("Email"));
		WebElement passwordField = driver.findElement(By.id("Password"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		usernameField.clear();
		usernameField.sendKeys("admin@yourstore.com");
		passwordField.clear();
		passwordField.sendKeys("admin");
		loginBtn.click();
		
		String ExpectedValue="home";
String		actualvalue=  driver.findElement(By.xpath("(//h1)[2]")).getText();


////	String	ActualValue=driver.getTitle();
//		
//	Assert.assertEquals(actualvalue,ExpectedValue);

//    Assert.assertTrue(ExpectedValue.equals(actualvalue));

 SoftAssert s=new SoftAssert();
 
 s.assertEquals(actualvalue, ExpectedValue);
    
    System.out.println("hi");
	s.assertAll();
    System.out.println("bye");

		
	
		
		
	}
}
