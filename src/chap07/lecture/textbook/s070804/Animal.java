package chap07.lecture.textbook.s070804;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을쉽니다.");
	}

	public abstract void sound();
}
