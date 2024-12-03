package com.itbulls;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Itbullspractice {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please, enter any text: ");
//		String userInput = sc.nextLine();
//		System.out.print("You entered these words: ");
//		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));
		
		
//		String digitPattern = "\\d+";
		String digitPattern = "(\\w+)\\p{P}+";
		Pattern p = Pattern.compile(digitPattern);
		String test = "You are 117777 in queue!!!";
		Matcher m = p.matcher(test);
		m.find();
		String queueNumber = m.group();
		System.out.println(queueNumber);
		
		
	}

}
