package Generics;

import java.util.HashMap;
import java.util.Scanner;

public class HashM {
	public static void main(String args[]){
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++)
		{
		String name = in.nextLine();
		int phone = in.nextInt();
		in.nextLine();
		hash.put(name, phone);
		while(in.hasNext()){
			String s = in.nextLine();
			int out = hash.get(s);
			System.out.println(s+" "+out);
		}
		
		
		
		}
		
		
		
		
		
		
	}

}
