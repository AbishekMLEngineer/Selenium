package Generics;

import org.testng.annotations.Test;

public class Hacker2 {
	@Test
	public void hack2(){
		String str = "Abcdefghijk";
		int length =0;
		while(str!=""){
			str = str.substring(1);
			++length;
		}
		System.out.println(length);
	}
	@Test
	public void hack3(){
		String str1 = "Abcd";
		char ai[]=	str1.toCharArray();
		int k=0;
		for(char singh :ai){
			k++;
		}
		System.out.println(k);
	}
	
	
	
	

}
