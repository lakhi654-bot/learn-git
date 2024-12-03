import java.util.function.Supplier;

import org.apache.commons.lang3.RandomStringUtils;

public class testMath {
	public static void main(String[] args) {
//		System.out.println(calculate((i,j)->i+j,7,6));
//		System.out.println(calculate((i,j)->i-j,7,6));
//		System.out.println(calculate((i,j)->i*j,7,6));
//		System.out.println(calculate((i,j)->i/j,6,2));
		Supplier<String> random = ()->"Email Subject: "+RandomStringUtils.randomAlphanumeric(10);
		System.out.println(random.get());
	}
	
	private static int calculate(MathematicalOperations o,int i,int j) {
		return o.operate(i, j);
	}
}
