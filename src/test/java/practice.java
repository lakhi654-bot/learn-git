import java.math.*;
public class practice {
	public static void main(String[] args) {
//		reverseString("jeevam");
		
		String s="",reverse="jeevam";
		 for(int i=0;i<reverse.length();i++) {
			 s=(reverse.charAt(i))+s;
		 }
		 
		 BigDecimal dec = BigDecimal.valueOf(20).setScale(2,RoundingMode.HALF_EVEN);
		 BigDecimal nopersons = BigDecimal.valueOf(3);
		 BigDecimal uberPrice = dec.divide(nopersons, RoundingMode.HALF_UP);
		 double i = dec.doubleValue();
		 BigDecimal uberPrice3 = BigDecimal.valueOf(Math.PI);
		 System.out.println(uberPrice);
		 
	}

//	public static void reverseString (String reverse) {
//		String s="";
//	 for(int i=0;i<reverse.length();i++) {
//		 s=(reverse.charAt(i))+s;
//	 }
//	}
}
