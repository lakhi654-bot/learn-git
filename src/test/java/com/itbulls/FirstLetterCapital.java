package com.itbulls;

import java.util.Arrays;

public class FirstLetterCapital {
	public static void main(String[] args) {
		String word= "my   name   is    java!!!";
//		String[] words = word.split("\s+");
//		String[] newWords = new String[words.length];
//		int index = 0;
//		for(String x:words) {
//			newWords[index++]=x.replace(String.valueOf(x.charAt(0)),String.valueOf(x.charAt(0)).toUpperCase());
//		}
//		System.out.println(String.join(" ",newWords));
		System.out.println(firstCharToTitleCase(word));
	}

	public static String firstCharToTitleCase(String string) {
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i])) {
				found = false;
			}
		}
		return String.valueOf(chars);
	}

}
