package chap03.binary;

public class DivideByZero {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
//		int z = x / y; int로 0을 나누면 오류가뜬다
		System.out.println("어떤 실행문");
		
		double a = -5.0;
		double b = 0.0;
		
		double c = a / b;
		System.out.println(c);
		
		// 0으로 나눌경우 값이 Infinity로 표시된다.
		
		double d = a % b;
		System.out.println(d);
		// 0으로 나머지를 구할경우 NAN이뜬다(Not a Number)
	}

}
