package com.practicehous.star;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {

		System.out.println("Pyramid Of Star in Java");
		System.out.println("How Many Lines You Want To Print");
		Scanner sc = new Scanner(System.in);

		int numOfLines = sc.nextInt();
		
		// loop for how many lines we want to print
		for (int i = 0; i < numOfLines; i++) {
			
			// Innner Loop For Space/Gap
			for (int j = numOfLines - i; j > 1; j--) {
				System.out.print(" ");
			}
			
			// Loop For printing star
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			
			// after one row we need new line
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Reverse Pyramid Of Star ");
		System.out.println();
		
		
		for(int i = numOfLines; i > 0; i--) {
			
			for(int j = numOfLines-i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		

	}

}
