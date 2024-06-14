package demoparamas;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C {
	
	@Parameters({"p1","p2"})
	@Test
	public void m1(int v1,int v2) {
		int a=v1;
		int b=v2;
		System.out.println(a+b);
	}

}
