package com.itbulls;

import java.util.Arrays;
import java.util.List;

public class listPractice {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4);
		int[] list = {1,2,3,4};
//	    System.out.println("Maximum number in given array: "+Arrays.stream(list).max().getAsInt());
		String[] stringA = {"Apple","Soda","Please"};
		String[] interA = {"1","8","4","32"};
		System.out.println(String.join(" ", stringA));
		System.out.println(Arrays.toString(stringToInt(interA)));
		int[] newInt = stringToInt(interA);
		System.out.println("Max number: "+maxInteger(newInt));
		System.out.println(sum(1,5,6));
		System.out.println(sum(5,6));
	}
	
	public static int sum(int ...iarg) {
		int sum=0;
		for(int i:iarg) {
			sum+=i;
		}
		return sum;
	}
	public static int[] stringToInt(String[] stringA){
	    int[] intConvert=new int[stringA.length];
	    for(int i=0;i<stringA.length;i++){
	        intConvert[i]=Integer.valueOf(stringA[i]);
	    }
	    return intConvert;
	}
	
	public static int maxInteger(int[] intArray) {

		int max = intArray[0];
		for (int i : intArray) {
			if (i > max) {
				max = i;
			}
		}
		return max;
		
	}

}
