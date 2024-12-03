import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public class driverMethods {
	public static void main(String[] args) {

//			reverseString("jeevam");

		String s = "", reverse = "jeevam";
		for (int i = 0; i < reverse.length(); i++) {
			s = (reverse.charAt(i)) + s;
		}
		System.out.println(s);

//		List<Character>array=	reverseString(" Reverse  String  ");
//		System.out.println(array);
//		Collections.reverse(array);
//		List<String> messages = Arrays.asList("hello", "baeldung", "readers!","hiii");
//		List<String> messages = new ArrayList<>();
//		messages.add("harini");
//		messages.add("angel");
//		Predicate<String> condition = (s)->s.toLowerCase().contains("h");
//		messages.removeIf(condition);
//		messages.forEach(System.out::println);
//		messages.stream().filter(condition.negate()).map(StringUtils::capitalize).forEach(System.out::println);

//		messages.stream().map(StringUtils::capitalize).forEach(System.out::println);

//		System.out.println(String.valueOf(array.stream().map(String::valueOf).collect(Collectors.joining())));

	}

	public static List<Character> reverseString(String str) {

		return String.copyValueOf(str.toCharArray()).chars().mapToObj(i -> (char) i).collect(Collectors.toList());
	}

	public static String stringAccept(String s) {
		return s;
	}
}
