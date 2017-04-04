package Generics;

import java.util.Scanner;

public class Hacker1 {
	public static int getNumArrays(int[] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			int e = a[i];
			i=e+i;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []a = new int[n];
		for(int i =0;i<a.length;i++){
			a[i] = in.nextInt();
		}
		System.out.println(getNumArrays(a));
		
		
		
		
		
		
	}

}
