package chap07.lecture.textbook.exercies.p08;

class A{}
class B extends A{}
class D extends B{}
class E extends B{}

public class P08 {
	public static void main(String[] args) {
		B b = new B();
		B b4 = (B) new A();//오류
		B b2 = new D();
		B b3 = new E();
	}
	

}
