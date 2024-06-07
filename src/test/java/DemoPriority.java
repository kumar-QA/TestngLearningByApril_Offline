import org.testng.annotations.Test;

public class DemoPriority {

	@Test
	public void C() {
		System.out.println("C script");
	}
	
	@Test(priority =- 1)
	public void D() {
		System.out.println("D script");
	}
	
	@Test
	public void A() {
		System.out.println("A script");
	}
	@Test(priority = -1)
	public void B() {
		System.out.println("B script");
	}
	
	@Test(priority = -1)
	public void E() {
		System.out.println("E script");
	}
	
	
}

// B D E A C