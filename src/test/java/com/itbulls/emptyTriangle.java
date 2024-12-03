package com.itbulls;

import java.util.Scanner;

public class emptyTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of rectangle: ");
		int length= sc.nextInt();
		System.out.println("Please enter width of rectangle: ");
		int width = sc.nextInt();
		for(int i=0;i<width;i++) {
			
			for(int j=0;j<length;j++) {
				if((i==0)||(i==(width-1)||(j==0))||(j==(length-1))){
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
