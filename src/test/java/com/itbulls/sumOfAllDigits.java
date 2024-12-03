package com.itbulls;

public class sumOfAllDigits {
	public static void main(String[] args) {
		int i = 12;
		int sum=0;
		while(i>0) {
			int m =i%10;
			i = i/10;
			sum=sum+m;
		}
		System.out.println(Math.abs(sum));
	}

}
