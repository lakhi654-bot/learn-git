
package com.itbulls;
import java.util.*;

public class numbersstartingwithone {
public static void main(String[] args) {
	int arr[]= {1,76,123, 156,98,65,127};
	List<Integer> list= new ArrayList<Integer>();
	for(Integer x: arr) {
		if(Integer.toString(x).startsWith("1")) {
		list.add(x);
		}
	}
	for(Integer j:list) {
		System.out.println(j);
	}
}
}
