package waitsExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoForExlplicitywait {

	@Test
	public void GetElementValue() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.findElement(By.partialLinkText("Example 2:")).click();
		driver.findElement(By.xpath("//div[@id=\"start\"]/button")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5000));
	WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
	System.out.println(ele.getText());
	}
	
	@Test
	public void ClickTheElement() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.id("timerButton")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(4000));
	WebElement	ele=wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		ele.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
