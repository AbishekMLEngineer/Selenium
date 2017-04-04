package Generics;

import org.testng.annotations.Test;

public class GenDemo {
	@Test
	public void MainForInteger()
	{
	Gen<Integer> iob;
	iob = new Gen<Integer>(88);
	iob.showType();
	int v = iob.getob();//no casting is required
	System.out.println("Value"+v);
	}
	/**
	 * 
	 */
	@Test
	public void MainForString()
	{
		Gen<String> strob = new Gen<String>("Generics Test");
		strob.showType();
		String str  = strob.getob();
		
		
	}

}
