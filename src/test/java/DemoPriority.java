import org.testng.annotations.Test;

public class DemoPriority {

	@Test(description = "verify")
	public void C() {
		System.out.println("C script");
	} 	
	@Test(invocationCount = 10)
	public void D() {
		System.out.println("D script");
	}
	
	
//	@Test(timeOut = 4000)
//	public void A() throws InterruptedException {
//		Thread.sleep(3000);
//		
//	}
//	
	@Test
	public void verifyLogin() {
		System.out.
	}
	
	@Test(dependsOnMethods = "verifyLogin",alwaysRun = true)
	public void clickonCatalog() {
		System.out.println("E script");
	}
//	
//	
}

// B D E A C