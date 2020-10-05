package chap03.textbook;

public class InputDataCheckExample1 {

	public static void main(String[] args) {
		//valueOf: 숫자로 변환할수있는 String 값(숫자, 키워드)
		String input = "3.14";
		double v =Double.valueOf(input);
		System.out.println(v);
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
