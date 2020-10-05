package chap03.textbook;

public class ConditionlOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B': 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)((lengthTop+ lengthBottom)*height)/2;
		System.out.println(area);
	}

}
