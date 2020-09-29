package chap02.textbook;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue= 10;
		int intVlaue= byteValue;
		System.out.println(intVlaue);
		
		char charValue = '가';
		intVlaue = charValue;
		System.out.println("가의 유니코드= " + intVlaue);
		
		intVlaue = 500;
		long longValue = intVlaue;
		System.out.println(longValue);
		
		intVlaue = 200;
		double doubleValue = intVlaue;
		System.out.println(doubleValue);
		
	}
}
