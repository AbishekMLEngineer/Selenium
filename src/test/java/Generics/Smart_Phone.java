package Generics;

import org.testng.annotations.Test;

public class Smart_Phone {
	//@Test
	public static void main(String args[]){
		//System.out.println("Hello");
		Phone obj = new Phone(){
			public void show(){
				System.out.println("Hello HII Byee");
			}
		};
		
	}
	//@Test
	public void show(){
		System.out.println("Hii");
	}
	

}
