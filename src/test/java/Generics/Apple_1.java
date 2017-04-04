package Generics;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class Apple_1 {
	/**
	 *public void paint(Graphics g)
	{
		g.drawString("A Simple Applet", 20, 30);
	} 
	 */
	
	public static void main(String args[])
	{
		ArrayList<Integer> demo = new ArrayList<Integer>(5); 
		demo.add(23);
		demo.add(44);
		for(int i =0; i<2;i++){
			demo.add(i);
		}
		for(int i =0;i<4;i++){
			System.out.println(demo);
		}
		System.out.println("This is Demo" +demo);
		
		
		
	}
}
