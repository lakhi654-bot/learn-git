package com.itbulls;

import java.util.Arrays;
import java.util.Scanner;

public class FilterString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		System.out.println(Arrays.toString(words));
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] stringArray=new String[words.length];
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>=minLength) {
				stringArray[i]=words[i];
			}
		}
		stringArray = filterArray(stringArray);
		return stringArray;
	}
   
	public static String[] filterArray(String[] stringArray) {
		int count=0;
		for(String x:stringArray) {
			if(x!=null) {
				count++;
			}
		}
		int index=0;
		String[] newArray=new String[count];
		for(String x:stringArray) {
			if(x!=null) {
				newArray[index++]=x;
			}
		}
		return newArray;
	}
}
