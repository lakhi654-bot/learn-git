package com.itbulls;
import java.util.Scanner;

public class condition {
 public static void main(String[] args) {
//	 String mode = String.join(",", args);
//	 String adminmode = "--admin";
//	 String guestMode = "--guest";
//	 if(mode.contains(adminmode)) {
//		 System.out.println("Hello, Admin");
//	 }else if (mode.contains(guestMode)) {
//		 System.out.println("Hello, Guest");
//	 }else if(mode.contains(adminmode) && mode.contains(guestMode)) {
//		 System.out.println("Hello, Please specify mode");
//	 }
	 Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any integer: ");
		int i = sc.nextInt();
//		while(i>=10) {
//			System.out.println("Number: "+i%10);
//			
//			i = i/10;
//			}
//		System.out.println("Number: "+i);
//		for(char j:i.toCharArray()) {
//			System.out.println(j);
//		}
		for(int j=0;j<=i;j++) {
			
			for(int p=0;p<j;p++) {
				System.out.print("*");	
			}
			System.out.println();
		}
for(int j=i;j>=0;j--) {
			
			for(int p=1;p<j;p++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	
 }

}
