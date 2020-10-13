package chap06.lecture.method.overloading;

public class MyApp {
	public static void main(String[] args) {
		Myclass o1 = new Myclass();
		o1.method1();
		o1.method1(3);
		o1.method1(0.0);
	}
//	오버로딩: 메소드이름이 같을때 파라미터값을 다르게줌

}