import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotation {
	@BeforeMethod
	public void m4() {
		System.out.println("Before Method is running");
	}
	@BeforeSuite
	public void m1() {
		System.out.println("Before Suite is running");
	}
	@BeforeTest
	public void m2() {
		System.out.println("Before Test is running");
	}
	@BeforeClass
	public void m3() {
		System.out.println("Before class is running");
	}	
	@Test
	public void verify() {
		System.out.println("script1 is started");
	}
	@Test
	public void verify1() {
		System.out.println("script2 is started");
	}
	@AfterClass
	public void m6() {
		System.out.println("Afterclass is running");
	}
	@AfterSuite
	public void m7() {
		System.out.println("Aftersuiet is running");
	}
	
	@AfterTest
	public void m8() {
		System.out.println("AfterTest is running");
	}
	
	@AfterMethod
	public void m5() {
		System.out.println("AfterMethod is running");
	}
}
