package chap03.textbook.exercises;

public class Exercise {
	public static void main(String[] args) {
		
		int value = 356;
		System.out.println(300 % value);
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {
			System.out.println("나눌수 없음");
		}else {
			double result = z+ 10;
			System.out.println("결과: " + result);
		}
	}

}
