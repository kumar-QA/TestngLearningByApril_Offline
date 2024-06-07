package mouseacttions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoForMouseActions {

	@Test
	public void verifyMoveToElement() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		WebElement blogs = driver.findElement(By.id("blogsmenu"));
		WebElement ThirdLink = driver.findElement(By.xpath("//span[contains(text(),'SeleniumOneByArun')]"));

		Actions act = new Actions(driver);
		act.moveToElement(blogs);
		Thread.sleep(2000);
		act.moveToElement(ThirdLink).click().build().perform();

	}
	
	
	
	
	
	

	@Test
	public void verifyRightClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));

		Actions act = new Actions(driver);
		act.contextClick(btn).build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void verifyDoubleClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement bdbtn = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));

		Actions act = new Actions(driver);
		act.doubleClick(bdbtn).build().perform();
	}
	
	@Test
	public void verifyDragAndDropClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		 driver.switchTo().frame(0);
		
		  WebElement src=driver.findElement(By.id("draggable"));
		  WebElement  dst = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(src, dst).build().perform();
		
	}
	

}
