package chap06.lecture.method.overloading;

public class Myclass {
	
	void method1() {
		System.out.println("method1.....");
	}
	
	void method1(int i) {
		System.out.println("method1########");
		System.out.println(i);
	}
	
	void method1(double j) {
		System.out.println("method1************");
	}
	void method1(int i, int j) {
		System.out.println("method1 int, int");
	}
	void method1(int i, double j) {
		System.out.println("method1 int, double");
	}
	void method1(double j , int i) {
		System.out.println("method1 double, int");
	}
	

}
