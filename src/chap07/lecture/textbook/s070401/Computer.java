package chap07.lecture.textbook.s070401;

public class Computer extends Calcutor{
	@Override
	double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}

}
