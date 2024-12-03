package com.itbulls;

import java.util.Scanner;

public class amountOfWords {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter string: ");
		String stringTest = sc.nextLine();
		String[] splitString = stringTest.split("[\\p{P}\\s]+");
		System.out.println("Number of words: "+splitString.length);
	}

}
