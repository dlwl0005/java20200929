package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		// byte, short, int, long
		// float, double, char, double
		
		// Byte, Short, Integer, Long
		// Float, Double, Character, Boolean
		
		int  i =1;
		
		Integer in = Integer.valueOf(i);
		method1(in);
		
		int j = 2;
		method1(j);
		
		int k = in;
		
		Integer in2 = 3;
		int m = in2;
		method1(m);
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}

}
