package demoparamas;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {

	@Parameters({"p1","p2"})
	@Test
	public void m1(int c1,int c2) {
		int a=c1;
		int b=c2;
		System.out.println(a+b);
	}


}
