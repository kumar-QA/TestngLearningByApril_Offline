package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWebTable {

	
	@Test
	public void getHeaderData() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		System.out.println(driver.findElement(By.xpath("//table[@id=\"table1\"]/thead/tr/th[1]")).getText());
	
		System.out.println(driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[3]/td[3]")).getText());
		
	
	}
	
	@Test
	public void getALLHeaderData() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
	List<WebElement>columncount=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
	
	for (int i = 0; i <columncount.size(); i++) {
		
		System.out.print(columncount.get(i).getText()+"  ");
//		System.out.print(driver.findElement(By.xpath("//table[@id=\"table1\"]/thead/tr/th["+i+"]")).getText()+"  ");
	}
	
	}
	
	@Test
	public void getALLBodyData() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
	List<WebElement>rowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	List<WebElement >columncount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
	
	for (int i = 1; i <=rowcount.size(); i++) {
		
		for (int j = 1; j <=columncount.size(); j++) {
			
		String data	=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
		
		System.out.print(data+"  ");
		}
		System.out.println();

	}
	
	}
	
	@Test
	public void getTableData() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		List<WebElement>columncount1=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		
		for (int i = 0; i <columncount1.size(); i++) {
			
			System.out.print(columncount1.get(i).getText()+"  ");
		}
		System.out.println();
		
	List<WebElement>rowcount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	List<WebElement >columncount=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
	
	for (int i = 1; i <=rowcount.size(); i++) {
		
		for (int j = 1; j <=columncount.size(); j++) {
			
		String data	=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
		
		System.out.print(data+"  ");
		}
		System.out.println();

	}
	
	}
	
}
